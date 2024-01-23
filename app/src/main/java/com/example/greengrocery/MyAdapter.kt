package com.example.greengrocery

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MyAdapter: RecyclerView.Adapter<MyAdapter.MyHolder> {


    private val context: Context
    private val item_list:ArrayList<Vegetables>

    constructor(context: Context, item_list: ArrayList<Vegetables>) : super() {
        this.context = context
        this.item_list = item_list
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item, parent,false)
        return MyHolder(view)

    }

    override fun getItemCount(): Int {
        return item_list.size
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        val vegetables = item_list.get(position)
        holder.setDetails(vegetables)
    }




    inner class MyHolder(itemView:View): RecyclerView.ViewHolder(itemView) {

        var title:TextView
        var descrp:TextView
        var img:ImageView



        init {
            title = itemView.findViewById(R.id.titlest)
            descrp = itemView.findViewById(R.id.descrp)
            img = itemView.findViewById(R.id.imageView2)

            itemView.setOnClickListener() {
                Toast.makeText(itemView.context, "You clicked ${item_list[adapterPosition].title} ", Toast.LENGTH_SHORT).show()
            }




        }
        fun setDetails(vegetables: Vegetables) {
            title.setText(vegetables.title)
            descrp.setText(vegetables.desrcp)
            img.setImageResource(vegetables.img)

        }
    }
}


