package agloin.messenger.telegram

import agloin.messenger.telegram.activities.RegisterActivity
import agloin.messenger.telegram.databinding.ActivityMainBinding
import agloin.messenger.telegram.ui.fragments.ChatsFragment
import agloin.messenger.telegram.ui.objects.AppDrawer
import agloin.messenger.telegram.ui.utilits.replaceActivity
import agloin.messenger.telegram.ui.utilits.replaceFragment
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding
    private lateinit var mToolBar: Toolbar
    private lateinit var mAppDrawer: AppDrawer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
    }

//    private fun fragmentsManager(fragment: Fragment, goBackStack: Boolean?) {
//        supportFragmentManager.beginTransaction().replace(R.id.dataContainer, fragment).commit()
//    }

    override fun onStart() {
        super.onStart()
//        fragmentsManager(ChatsFragment())
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.dataContainer, ChatsFragment())
            .commit()
        initFields()
        initFunc()
    }

    private fun initFunc() {
        if (true) {
            setSupportActionBar(mToolBar)
            mAppDrawer.create()
            replaceFragment(ChatsFragment())
        } else{
            replaceActivity(RegisterActivity())
        }


    }


    private fun initFields() {
        mToolBar = mBinding.mainToolBar
        mAppDrawer = AppDrawer(this, mToolBar)
    }
}