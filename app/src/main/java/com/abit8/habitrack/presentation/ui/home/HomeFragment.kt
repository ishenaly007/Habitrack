package com.abit8.habitrack.presentation.ui.home

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.abit8.habitrack.R
import com.abit8.habitrack.databinding.FragmentHomeBinding
import java.time.LocalDate

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val date: LocalDate = LocalDate.now()
            binding.tvDate.text = date.dayOfMonth.toString()
        }
        clickers()
    }

    private fun clickers() {
        binding.addBtn.setOnClickListener {
            findNavController().navigate(R.id.createHabit)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}