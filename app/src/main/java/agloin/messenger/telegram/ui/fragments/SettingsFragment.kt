package agloin.messenger.telegram.ui.fragments

import agloin.messenger.telegram.MainActivity
import agloin.messenger.telegram.R
import agloin.messenger.telegram.activities.RegisterActivity
import agloin.messenger.telegram.ui.utilits.AUTH
import agloin.messenger.telegram.ui.utilits.replaceActivity
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem

class SettingsFragment : BaseFragment(R.layout.fragment_settings) {
    override fun onResume() {
        super.onResume()
        setHasOptionsMenu(true)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        activity?.menuInflater?.inflate(R.menu.settings_action_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.settings_menu_exit -> {
                AUTH.signOut()
                (activity as MainActivity).replaceActivity(RegisterActivity())
            }
        }
        return true
    }
}