package com.eternalengine.wearme

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListWearAdapter(private val listWear: ArrayList<Wear>): RecyclerView.Adapter<ListWearAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    interface OnItemClickCallback {
        fun onItemClicked(data: Wear)
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_wear, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val wear = listWear[position]

        Glide.with(holder.itemView.context)
            .load(wear.photo)
            .apply(RequestOptions().override(150, 150))
            .into(holder.imgPhoto)

        holder.tvName.text = wear.name
        holder.tvDetail.text = wear.detail

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listWear[holder.adapterPosition]) }

    }

    override fun getItemCount(): Int {
        return listWear.size
    }

    inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
}