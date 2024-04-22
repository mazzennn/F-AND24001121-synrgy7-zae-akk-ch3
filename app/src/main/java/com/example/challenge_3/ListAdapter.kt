package com.example.challenge_3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(val callback: (String) -> Unit) : RecyclerView.Adapter<ListAdapter.ViewHolder>()
{
    private val diffCallback = object : DiffUtil.ItemCallback<String>() {
        override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
            return oldItem == newItem
        }
    }

    private val differ = AsyncListDiffer(this, diffCallback)

    fun submitList(value: List<String>) = differ.submitList(value)

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val tvWord: TextView = itemView.findViewById(R.id.word)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvWord.text = differ.currentList[position].toString()
        holder.itemView.setOnClickListener {
            callback(differ.currentList[position])
        }

    }


}