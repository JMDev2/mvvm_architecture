package com.example.mvvm.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvm.Model.MovieModel
import com.example.mvvm.R
import com.squareup.picasso.Picasso

class MovieListAdapter(var context: Context, var movieModelList: MutableList<MovieModel>):
    RecyclerView.Adapter<MovieListAdapter.MyViewHolder>() {
    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textId: TextView
        var imgMovie: ImageView
        var textTitle: TextView


        init {
            textId = itemView.findViewById(R.id.view_id)
            imgMovie = itemView.findViewById(R.id.view_image)
            textTitle = itemView.findViewById(R.id.text_title)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(context).inflate(R.layout.layout, parent,false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textId.text = movieModelList[position].id.toString()
        Picasso.get().load(movieModelList[position].url).into(holder.imgMovie)
        holder.textTitle.text = movieModelList[position].title
    }

    override fun getItemCount(): Int {
        return movieModelList.size
    }
}