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
import kotlinx.android.synthetic.main.fragment_details_sub_service_owner.view.*
import kotlinx.android.synthetic.main.fragment_home.view.*
import kotlinx.android.synthetic.main.layout_reviews.view.*
import kotlinx.android.synthetic.main.layout_reviews.view.T_review_numbers

/**
 * A simple [Fragment] subclass.
 */
class DetailsSubServiceOwnerFragment : Fragment() {
    lateinit var root:View
    lateinit var reviewsAdapter: ReviewsAdapter
    lateinit var popUpview:View
    lateinit var popUpReportview:View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        root= inflater.inflate(R.layout.fragment_details_sub_service_owner, container, false)
        root.T_review_numbers.setOnClickListener { view-> gotoLayoutReviews() }
        root.T_report.setOnClickListener { view->goToLayoutReport_subservice_owner() }
        return root
    }

    private fun goToLayoutReport_subservice_owner() {
        val builder = android.app.AlertDialog.Builder(context).create()
        popUpReportview = LayoutInflater.from(context).inflate(R.layout.layout_report_subservice_owner, null)
        builder.setView(popUpReportview)
        // dialog.setCancelable(false);
        builder.show()
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
