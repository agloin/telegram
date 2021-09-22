package agloin.messenger.telegram.ui.fragments

import agloin.messenger.telegram.R
import agloin.messenger.telegram.ui.utilits.AppTextWatcher
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_enter_code.*

class EnterCodeFragment : Fragment(R.layout.fragment_enter_code) {

    override fun onStart() {
        super.onStart()

        register_input_code.addTextChangedListener(AppTextWatcher {
            val string = register_input_code.text.toString()

            if (string.length == 5) {
                verifyCode()
            }
        })
    }

    private fun verifyCode() {
        Toast.makeText(activity?.applicationContext, "Ok", Toast.LENGTH_SHORT).show()
    }
}