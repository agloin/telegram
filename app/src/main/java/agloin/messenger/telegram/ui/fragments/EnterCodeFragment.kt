package agloin.messenger.telegram.ui.fragments

import agloin.messenger.telegram.MainActivity
import agloin.messenger.telegram.R
import agloin.messenger.telegram.activities.RegisterActivity
import agloin.messenger.telegram.ui.utilits.AUTH
import agloin.messenger.telegram.ui.utilits.AppTextWatcher
import agloin.messenger.telegram.ui.utilits.replaceActivity
import agloin.messenger.telegram.ui.utilits.showToast
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.PhoneAuthProvider
import kotlinx.android.synthetic.main.fragment_enter_code.*

class EnterCodeFragment(val phoneNumber: String, val id: String) : Fragment(R.layout.fragment_enter_code) {



    override fun onStart() {
        super.onStart()
        (activity as RegisterActivity).title = phoneNumber
        register_input_code.addTextChangedListener(AppTextWatcher {
            val string = register_input_code.text.toString()

            if (string.length == 6) {
                enterCode()
            }
        })
    }

    private fun enterCode() {
        val code = register_input_code.text.toString()
        val credential = PhoneAuthProvider.getCredential(id, code)

        AUTH.signInWithCredential(credential).addOnCompleteListener{ task ->
            if (task.isSuccessful) {
                showToast("Welcome")
                (activity as RegisterActivity).replaceActivity(MainActivity())
            } else {
                showToast(task.exception.toString())
            }
        }
    }
}