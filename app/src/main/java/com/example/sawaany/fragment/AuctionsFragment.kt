package com.example.sawaany.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.sawaany.R
import com.example.sawaany.activity.NavigationActivity
import com.example.sawaany.adapter.AuctionsAdapter
import com.example.sawaany.adapter.ServicesAdapter
import kotlinx.android.synthetic.main.fragment_auctions.view.*
import kotlinx.android.synthetic.main.fragment_login.view.*
import kotlinx.android.synthetic.main.fragment_services.view.*

/**
 * A simple [Fragment] subclass.
 */
class AuctionsFragment : Fragment() {
    lateinit var auctionsAdapter: AuctionsAdapter
    lateinit var root:View
    lateinit var popUpview:View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        root= inflater.inflate(R.layout.fragment_auctions, container, false)
        init()
        auctionsList()
        root.card_add_auction.setOnClickListener { view-> goToLayoutAddAuction() }
        return root
    }

    private fun goToLayoutAddAuction() {
        val builder = android.app.AlertDialog.Builder(context).create()

        popUpview = LayoutInflater.from(context).inflate(R.layout.layout_add_auction, null)
        builder.setView(popUpview)
        // dialog.setCancelable(false);
        builder.show()
    }

    private fun init() {
        //Toast.makeText(context, "Hi there! This is a Toast.", Toast.LENGTH_SHORT).show()
        val toggle = ActionBarDrawerToggle(
            activity,
            NavigationActivity.drawerLayout,
            root!!.toolbar_auctions,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )
        toggle.apply {
            syncState()
            isDrawerIndicatorEnabled = false
            setHomeAsUpIndicator(R.drawable.menu)
            setToolbarNavigationClickListener { NavigationActivity.drawerLayout!!.openDrawer(
                GravityCompat.START) }
        }
        NavigationActivity.drawerLayout?.addDrawerListener(toggle)
    }

    private fun auctionsList() {
        root.recycler_auctions.apply {
            layoutManager= LinearLayoutManager(context)
            auctionsAdapter = AuctionsAdapter(context)
            adapter=auctionsAdapter
        }
    }

}
