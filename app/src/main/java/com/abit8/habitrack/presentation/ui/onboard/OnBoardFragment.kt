package com.abit8.habitrack.presentation.ui.onboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.abit8.habitrack.R
import com.abit8.habitrack.databinding.FragmentOnBoardBinding

class OnBoardFragment : Fragment() {
    private lateinit var binding: FragmentOnBoardBinding
    private val adapter = OnBoardAdapter(
        onStartClick = this::onStartClick
    )

        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View {
            binding = FragmentOnBoardBinding.inflate(layoutInflater)
            return binding.root
        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter.run{
            addOnBoard(OnBoard(R.drawable.first_on_board.toString(), R.string.first_on_board.toString(), 1))
            addOnBoard(OnBoard(R.drawable.second_on_board.toString(), R.string.tv_on_board.toString(), 2))
            addOnBoard(OnBoard(R.drawable.third_on_board.toString(), R.string.habitracker.toString(), 3))
        }
    }

    private fun onStartClick(onBoard: OnBoard) {
        if (onBoard.keyId==3) findNavController().navigate(R.id.navigation_home)
    }
}
