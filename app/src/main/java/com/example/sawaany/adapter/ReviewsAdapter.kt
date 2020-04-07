package com.example.sawaany.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.sawaany.R


class ReviewsAdapter (private val context: Context) :
    RecyclerView.Adapter<ReviewsAdapter.mViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ReviewsAdapter.mViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.row_reviews, parent, false)
        return ReviewsAdapter.mViewHolder(view)
    }

    override fun onBindViewHolder(holder: ReviewsAdapter.mViewHolder, position: Int) {
       /* holder.itemView.setOnClickListener()
        {
            val activity = holder.itemView.getContext() as AppCompatActivity
            val myFragment: Fragment = ServicesFragment()
            activity.supportFragmentManager.beginTransaction()
                .replace(R.id.constraint_home_container, myFragment).addToBackStack(null).commit()
        }*/
    }



    override fun getItemCount(): Int {
        // return heroList.size();
        return 20
    }

    class mViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


    }
}
