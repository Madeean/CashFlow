package com.madeean.cashflow.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.madeean.cashflow.R

class HomePageAdapter(
    var listData: ArrayList<String>,
    var context: Context
) : RecyclerView.Adapter<HomePageAdapter.HomePageViewHolder>() {

    class HomePageViewHolder(ItemView : View) : RecyclerView.ViewHolder(ItemView) {
        var barang_beli:TextView = ItemView.findViewById(R.id.nama_pengontrak_card)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomePageViewHolder {
        val view:View = LayoutInflater.from(parent.context).inflate(R.layout.data_card_home,parent,false)
        return HomePageAdapter.HomePageViewHolder(view)
    }

    override fun onBindViewHolder(holder: HomePageViewHolder, position: Int) {
        holder.barang_beli.text = listData[position]
    }

    override fun getItemCount(): Int {
        if (listData != null) {
            return listData.size
        }
        return 0
    }


}