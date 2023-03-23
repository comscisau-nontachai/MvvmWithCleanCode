package com.example.mvvmwithcleancode_sample.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmwithcleancode_sample.data.remote.response.DummyResponse2
import com.example.mvvmwithcleancode_sample.databinding.ItemRvProductBinding
import com.example.mvvmwithcleancode_sample.ui.BaseViewHolder

class ProductListAdapter(private val data : MutableList<DummyResponse2.Result> = ArrayList()) :
RecyclerView.Adapter<BaseViewHolder>(){

    internal fun addDataToList(data : List<DummyResponse2.Result>){
        this.data.clear()
        this.data.addAll(data)
        notifyDataSetChanged()
    }

    inner class ViewHolder(private val binding: ItemRvProductBinding) :
        BaseViewHolder(binding.root) {
        override fun clear() {
            binding.apply {
                tvQuestion.text = ""
                tvCorrectAns.text = ""
            }
        }

        override fun onBind(position: Int) {
            val model = data[position]
            binding.apply {
                tvQuestion.text = "Question : ${model.question}"
                tvCorrectAns.text = "Answer : ${model.correctAnswer}"
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        return ViewHolder(ItemRvProductBinding.inflate(LayoutInflater.from(parent.context),
        parent,
        false))
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        holder.onBind(position)
    }


}