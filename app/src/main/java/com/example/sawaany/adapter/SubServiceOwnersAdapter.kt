package com.example.sawaany.adapter

import android.content.Context
import android.text.util.Linkify
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.sawaany.R
import com.example.sawaany.fragment.DetailsSubServiceOwnerFragment
import com.example.sawaany.fragment.ServicesFragment
import com.example.sawaany.fragment.SubServicesFragment


class SubServiceOwnersAdapter  (private val context: Context) :
    RecyclerView.Adapter<SubServiceOwnersAdapter.mViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): mViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.row_sub_service_owners, parent, false)
        return SubServiceOwnersAdapter.mViewHolder(view)
    }

    override fun onBindViewHolder(holder: SubServiceOwnersAdapter.mViewHolder, position: Int) {
        holder.bindItems()


    }



    override fun getItemCount(): Int {
        // return heroList.size();
        return 20
    }

    class mViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems() {
            val ic_show_details = itemView.findViewById(R.id.ic_show_details) as ImageView
            ic_show_details.setOnClickListener { view->showDetails() }

        }

        private fun showDetails() {
            val activity = itemView.getContext() as AppCompatActivity
            val myFragment: Fragment = DetailsSubServiceOwnerFragment()
            activity.supportFragmentManager.beginTransaction()
                .replace(R.id.constraint_sub_services_container, myFragment).addToBackStack(null).commit()
        }

    }
}
