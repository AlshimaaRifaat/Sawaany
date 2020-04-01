package com.example.sawaany.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat

import com.example.sawaany.R
import com.example.sawaany.activity.NavigationHomeActivity
import kotlinx.android.synthetic.main.fragment_home.view.*

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {
lateinit var root:View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        root= inflater.inflate(R.layout.fragment_home, container, false)
        init()
        return root
    }

    private fun init() {
        val toggle = ActionBarDrawerToggle(
            activity,
            NavigationHomeActivity.drawerLayout,
            root!!.toolbar_home,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )
        toggle.apply {
            syncState()
            isDrawerIndicatorEnabled = false
            setHomeAsUpIndicator(R.drawable.menu)
            setToolbarNavigationClickListener { NavigationHomeActivity.drawerLayout!!.openDrawer(GravityCompat.START) }
        }
        NavigationHomeActivity.drawerLayout?.addDrawerListener(toggle)
    }


}
