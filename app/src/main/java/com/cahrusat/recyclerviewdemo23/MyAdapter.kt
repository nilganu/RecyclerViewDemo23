package com.cahrusat.recyclerviewdemo23

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycleitem.view.*

class MyAdapter (var myArray:ArrayList<Student>)
    :RecyclerView.Adapter<MyAdapter.ViewHolder>()
{



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)
    : ViewHolder {
        var inflater=LayoutInflater.from(parent.context)
        var view=inflater.inflate(R.layout.recycleitem,parent,
            false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder,
                                  position: Int){

        holder.bind(myArray[position])
    }

    override fun getItemCount(): Int {
        return myArray.size
    }

    class ViewHolder(var itemView:View):
        RecyclerView.ViewHolder(itemView)
    {
        fun bind(stud:Student){
            itemView.txtName.text=stud.name
            itemView.txtId.text=stud.id.toString()
        }
    }
}