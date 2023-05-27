package com.abit8.habitrack.presentation.ui.onboard

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.abit8.habitrack.databinding.ItemOnBoardBinding
import kotlin.reflect.KFunction1

class OnBoardAdapter(private val onStartClick: KFunction1<OnBoard, Unit>) :
    RecyclerView.Adapter<OnBoardAdapter.OnBoardViewHolder>(){

        private val onBoards = arrayListOf<OnBoard>()

        fun addOnBoard(onBoard: OnBoard){
        onBoards.add(onBoard)
    }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnBoardViewHolder {
            return OnBoardViewHolder(ItemOnBoardBinding.inflate(
                LayoutInflater.from(parent.context), parent, false))
        }

        override fun onBindViewHolder(holder: OnBoardViewHolder, position: Int) {
            holder.bind(onBoards[position])
        }

        override fun getItemCount(): Int = onBoards.size


        inner class OnBoardViewHolder(private val binding: ItemOnBoardBinding):
            RecyclerView.ViewHolder(binding.root) {

            fun bind(onBoard: OnBoard) {
                binding.tvTitle.text = onBoard.title
                binding.btnNext.setOnClickListener {
                    onStartClick
                }
            }
        }
    }
