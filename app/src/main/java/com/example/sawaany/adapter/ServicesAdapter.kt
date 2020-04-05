package com.example.sawaany.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sawaany.R


class ServicesAdapter (private val context: Context) :
    RecyclerView.Adapter<ServicesAdapter.mViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ServicesAdapter.mViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.row_services, parent, false)
        return ServicesAdapter.mViewHolder(view)
    }

    override fun onBindViewHolder(holder: ServicesAdapter.mViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        // return heroList.size();
        return 20
    }

    class mViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }
}
