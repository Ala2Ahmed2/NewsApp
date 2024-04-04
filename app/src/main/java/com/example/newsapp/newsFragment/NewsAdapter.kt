package com.example.newsapp.newsFragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.newsapp.api.model.newsResponse.Article
import com.example.newsapp.databinding.ItemNewsBinding

class NewsAdapter(var newsList: List<Article?>?): Adapter<NewsAdapter.NewsViewHolder> (){

    override fun getItemCount(): Int = newsList?.size ?:0

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.bind(newsList?.get(position))
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val itemBinding = ItemNewsBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return NewsViewHolder(itemBinding)
    }

    fun changeData(articles: List<Article?>?) {
        newsList = articles
        notifyDataSetChanged()
    }

    class NewsViewHolder(val itemBinding:ItemNewsBinding):ViewHolder(itemBinding.root){
        fun bind(news: Article?) {
            itemBinding.newsItem = news
            itemBinding.executePendingBindings()
        }

    }
}