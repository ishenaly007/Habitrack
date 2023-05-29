package com.abit8.habitrack.presentation.ui.useronboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TimePicker
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.abit8.habitrack.R
import com.abit8.habitrack.databinding.FragmentUserSleepBinding
import java.util.*

class UserSleep : Fragment() {
    private lateinit var binding: FragmentUserSleepBinding
    var hour = 0
    var minute = 0

    var savedHour = 0
    var savedMinute = 0
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentUserSleepBinding.inflate(layoutInflater)
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
            findNavController().navigate(R.id.secondSleepFragment)
        }
    }

    private fun getDateTimeCalendar(){
        val cal : Calendar = Calendar.getInstance()
        hour = cal.get(Calendar.HOUR)
        minute = cal.get(Calendar.MINUTE)
    }
    fun onTimeSet(view: TimePicker?, hourOfDay: Int, minute: Int) {
        savedHour = hourOfDay
        savedMinute = minute

       // binding.localTime.text ="Часов:$savedHour Минут:$savedMinute"
    }
}