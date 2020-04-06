package com.example.sawaany.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sawaany.R

class AuctionsAdapter (private val context: Context) :
    RecyclerView.Adapter<AuctionsAdapter.mViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): mViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.row_auctions, parent, false)
        return AuctionsAdapter.mViewHolder(view)
    }

    override fun onBindViewHolder(holder: AuctionsAdapter.mViewHolder, position: Int) {
        /*holder.itemView.setOnClickListener()
        {
            val activity = holder.itemView.getContext() as AppCompatActivity
            val myFragment: Fragment = DetailsSubServicesFragment()
            activity.supportFragmentManager.beginTransaction()
                .replace(R.id.constraint_sub_services_container, myFragment).addToBackStack(null).commit()
        }*/
    }



    override fun getItemCount(): Int {
        // return heroList.size();
        return 20
    }

    class mViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


    }
}
