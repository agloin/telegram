package agloin.messenger.telegram.ui

import agloin.messenger.telegram.databinding.FragmentChatsBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


class ChatsFragment : Fragment() {
    private lateinit var mBinding: FragmentChatsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentChatsBinding.inflate(layoutInflater)
        return mBinding.root
    }

    override fun onResume() {
        super.onResume() // Жизненный цикл фрагментов - здесь мы запускаем фрагмент
    }
}