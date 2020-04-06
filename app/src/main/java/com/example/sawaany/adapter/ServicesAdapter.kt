package com.example.sawaany.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.sawaany.R
import com.example.sawaany.fragment.SubServicesFragment


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
           holder.itemView.setOnClickListener()
           {
               val activity = holder.itemView.getContext() as AppCompatActivity
               val myFragment: Fragment = SubServicesFragment()
               activity.supportFragmentManager.beginTransaction()
                   .replace(R.id.constraint_services_container, myFragment).addToBackStack(null).commit()
           }
    }



    override fun getItemCount(): Int {
        // return heroList.size();
        return 20
    }

    class mViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


    }
}
