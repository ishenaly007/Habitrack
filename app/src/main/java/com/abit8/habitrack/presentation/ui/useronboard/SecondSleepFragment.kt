package com.abit8.habitrack.presentation.ui.useronboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.abit8.habitrack.R
import com.abit8.habitrack.databinding.FragmentSecondSleepBinding


class SecondSleepFragment : Fragment() {
    private lateinit var binding: FragmentSecondSleepBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondSleepBinding.inflate(layoutInflater)
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

        }
    }
}