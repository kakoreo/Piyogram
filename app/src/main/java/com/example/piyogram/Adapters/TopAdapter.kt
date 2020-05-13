package com.example.piyogram.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.piyogram.Model.topContentData
import com.example.piyogram.R
import kotlinx.android.synthetic.main.top_list_item.view.*

class TopAdapter(val context: Context, private val top: ArrayList<topContentData>) : RecyclerView.Adapter<TopAdapter.TopHolder>() {


    inner class TopHolder(v: View) : RecyclerView.ViewHolder(v) {

        private var view : View = v
        private lateinit var top : topContentData

        fun bindTop(top : topContentData) {
            val iconId = context.resources.getIdentifier(top.icon, "drawable", context.packageName)
            val imageId = context.resources.getIdentifier(top.image, "drawable", context.packageName)

            view.topIconImage.setImageResource(iconId)
            view.topImage.setImageResource(imageId)
            view.topName.text = top.name
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopHolder {
        return TopHolder(LayoutInflater.from(parent.context).inflate(R.layout.top_list_item, parent, false))
    }

    override fun getItemCount(): Int {
        return top.count()
    }

    override fun onBindViewHolder(holder: TopHolder, position: Int) {
        holder.bindTop(top[position])

    }
}