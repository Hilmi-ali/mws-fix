package com.example.responsi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class adapterMember(val userList: ArrayList<dataMember>): RecyclerView.Adapter<adapterMember.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.activity_member_models, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = userList[position]

        holder.photo.setImageResource(currentItem.photo)

    }

    override fun getItemCount(): Int {
        return userList.size
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val photo: ImageView = itemView.findViewById(R.id.memberPict)
        val member: TextView = itemView.findViewById(R.id.member)
    }
}