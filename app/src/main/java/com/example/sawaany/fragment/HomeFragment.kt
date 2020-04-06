package com.example.sawaany.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.recyclerview.widget.GridLayoutManager

import com.example.sawaany.R
import com.example.sawaany.activity.NavigationActivity
import com.example.sawaany.adapter.HomeAdapter
import com.example.sawaany.adapter.ServicesAdapter
import kotlinx.android.synthetic.main.app_bar_navigation.view.*
import kotlinx.android.synthetic.main.fragment_home.view.*
import kotlinx.android.synthetic.main.fragment_services.view.*

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {
lateinit var root:View
    lateinit var homeAdapter: HomeAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        root= inflater.inflate(R.layout.fragment_home, container, false)
       // root.card_services.setOnClickListener { view -> replaceFragment(ServicesFragment())  }
      //  root.card_auctions.setOnClickListener { view -> replaceFragment(AuctionsFragment())  }
        init()
        HomeList()
        return root
    }

    private fun HomeList() {
        root.recycler_home.apply {
            layoutManager= GridLayoutManager(context,2)
            homeAdapter = HomeAdapter(context)
            adapter=homeAdapter
        }
    }

    fun replaceFragment(fragment: Fragment){
        fragmentManager!!.beginTransaction().replace(R.id.constraint_home_container, fragment)
            .addToBackStack(null).commit()

    }
    private fun init() {
        val toggle = ActionBarDrawerToggle(
            activity,
            NavigationActivity.drawerLayout,
            root!!.toolbarhome,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )
        toggle.apply {
            syncState()
            isDrawerIndicatorEnabled = false
            setHomeAsUpIndicator(R.drawable.menu)
            setToolbarNavigationClickListener { NavigationActivity.drawerLayout!!.openDrawer(GravityCompat.START) }
        }
        NavigationActivity.drawerLayout?.addDrawerListener(toggle)
    }


}
