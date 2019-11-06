package com.motion.motioninlove.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.motion.motioninlove.R
import com.motion.motioninlove.utils.Tools
import com.motion.motioninlove.utils.loadImage
import kotlinx.android.synthetic.main.item_home.view.*

class HomeAdapter(private val children : List<HomeModel>)
    : RecyclerView.Adapter<HomeAdapter.ViewHolder>(){

    lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        val v =  LayoutInflater.from(parent.context)
                .inflate(R.layout.item_home,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return children.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val child = children[position]

        holder.initData(child)
        holder.initListener(context,child)
    }


    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        fun initData(child : HomeModel){
//            itemView.ivHomeItemPic.loadImage(child.pic)
            Tools.loadImage(itemView.ivHomeItemPic,child.pic)
            itemView.tvHomeItemName.text  = child.name
            itemView.tvHomeItemDesc.text  = child.desc
            itemView.rbHomeItemRating.rating  = child.rate
        }

        fun initListener(context : Context, child : HomeModel){
            itemView.setOnClickListener{
                // TODO : Do Something after item click
                itemView.btnHomeItemRate.setOnClickListener {
                    //TODO : Do Something if btnRate Clicked
                }
                itemView.setOnClickListener {
                    //TODO : Do Something if card Clicked
                }
            }
        }
    }
}
