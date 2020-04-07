package com.example.sawaany.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.sawaany.R
import com.example.sawaany.adapter.HomeAdapter
import com.example.sawaany.adapter.ReviewsAdapter
import kotlinx.android.synthetic.main.fragment_home.view.*
import kotlinx.android.synthetic.main.layout_reviews.view.*

/**
 * A simple [Fragment] subclass.
 */
class DetailsSubServiceOwnerFragment : Fragment() {
    lateinit var root:View
    lateinit var reviewsAdapter: ReviewsAdapter
    lateinit var popUpview:View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        root= inflater.inflate(R.layout.fragment_details_sub_service_owner, container, false)
        root.T_review_numbers.setOnClickListener { view-> gotoLayoutReviews() }
        return root
    }

    private fun gotoLayoutReviews() {
        val builder = android.app.AlertDialog.Builder(context).create()
        popUpview = LayoutInflater.from(context).inflate(R.layout.layout_reviews, null)
        listReviews()
        builder.setView(popUpview)
        // dialog.setCancelable(false);
        builder.show()
    }

    private fun listReviews() {
        popUpview.recycler_reviews.apply {
            layoutManager= LinearLayoutManager(context)
            reviewsAdapter = ReviewsAdapter(context)
            adapter=reviewsAdapter
        }
    }

}
