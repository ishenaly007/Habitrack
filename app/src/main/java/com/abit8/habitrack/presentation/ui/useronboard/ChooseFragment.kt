package com.abit8.habitrack.presentation.ui.useronboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.navigation.fragment.findNavController
import com.abit8.habitrack.R
import com.abit8.habitrack.databinding.FragmentChooseBinding

class ChooseFragment : Fragment() {
  private lateinit var binding: FragmentChooseBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentChooseBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        clickers()
    }

    private fun clickers() {
        binding.skip.setOnClickListener {
            findNavController().navigate(R.id.navigation_home)
        }
        binding.next.setOnClickListener {
            binding.chooseRv.isVisible = false
            binding.chooseRv2.isVisible = true
            binding.tv.setText(getString(R.string.choose__))
        }
    }
}