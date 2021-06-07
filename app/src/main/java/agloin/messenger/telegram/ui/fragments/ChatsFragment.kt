package agloin.messenger.telegram.ui.fragments

import agloin.messenger.telegram.R
import agloin.messenger.telegram.databinding.FragmentChatsBinding


class ChatsFragment : BaseFragment(R.layout.fragment_chats) {
    private lateinit var mBinding: FragmentChatsBinding

    override fun onResume() {
        super.onResume() // Жизненный цикл фрагментов - здесь мы запускаем фрагмент
    }
}