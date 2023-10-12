package com.example.recycleview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.R
import com.example.recycleview.db.Infomation

class CustamAdapter(private val  arrayList:List<Infomation>):RecyclerView.Adapter<CustamAdapter.Viewholder>() {

    inner class Viewholder(itemView:View):RecyclerView.ViewHolder(itemView){
        val tileTv :TextView = itemView.findViewById(R.id.titleTV)
        val nameTV :TextView = itemView.findViewById(R.id.nameTv)
        val NumberTv :TextView = itemView.findViewById(R.id.NumberTv)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustamAdapter.Viewholder {
        val itemView  = LayoutInflater.from(parent.context).inflate(R.layout.item_recycleview,parent,false)
        return Viewholder(itemView)
    }

    override fun onBindViewHolder(holder: CustamAdapter.Viewholder, position: Int) {
        val currentitem = arrayList[position]
        val firstLatter = currentitem.name
        holder.tileTv.text = firstLatter[0].toString()
        holder.nameTV.text =currentitem.name
        holder.NumberTv.text = currentitem.number
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }
}