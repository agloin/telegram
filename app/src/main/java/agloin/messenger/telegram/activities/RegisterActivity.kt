package agloin.messenger.telegram.activities

import agloin.messenger.telegram.R
import agloin.messenger.telegram.databinding.ActivityRegisterBinding
import agloin.messenger.telegram.ui.fragments.EnterPhoneNumberFragment
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class RegisterActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityRegisterBinding
    private lateinit var mToolbar: Toolbar


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityRegisterBinding.inflate(layoutInflater)

        setContentView(mBinding.root)
    }

    override fun onStart() {
        super.onStart()

        mToolbar = mBinding.registerToolBar
        setSupportActionBar(mToolbar)
        title = getString(R.string.register_title_your_phone)
        supportFragmentManager.beginTransaction()
            .add(R.id.registerDataContainer, EnterPhoneNumberFragment())
            .commit()
    }
}