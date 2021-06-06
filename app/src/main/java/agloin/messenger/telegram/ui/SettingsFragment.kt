package agloin.messenger.telegram.ui

import agloin.messenger.telegram.databinding.FragmentSettingsBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class SettingsFragment : Fragment() {

    private lateinit var mainBinding: FragmentSettingsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mainBinding = FragmentSettingsBinding.inflate(layoutInflater)
        return mainBinding.root
    }

    override fun onResume() {
        super.onResume()
    }
}