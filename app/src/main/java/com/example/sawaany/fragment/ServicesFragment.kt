package com.example.sawaany.fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sawaany.R
import com.example.sawaany.activity.NavigationActivity
import com.example.sawaany.adapter.ServicesAdapter
import kotlinx.android.synthetic.main.app_bar_navigation.view.*
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_services.view.*

/**
 * A simple [Fragment] subclass.
 */
class ServicesFragment : Fragment() {
    lateinit var servicesAdapter: ServicesAdapter
    lateinit var root:View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        root= inflater.inflate(R.layout.fragment_services, container, false)
      init()
        ServicesList()

        return root
    }

    private fun init() {
        //Toast.makeText(context, "Hi there! This is a Toast.", Toast.LENGTH_SHORT).show()
        val toggle = ActionBarDrawerToggle(
            activity,
            NavigationActivity.drawerLayout,
            root!!.toolbar_services,
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

    private fun ServicesList() {
      root.recyclerServices.apply {
            layoutManager= GridLayoutManager(context,2)
            servicesAdapter = ServicesAdapter(context)
            adapter=servicesAdapter
        }
    }




}
