package com.example.sawaany.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.sawaany.R
import com.example.sawaany.activity.NavigationActivity
import com.example.sawaany.adapter.SubServicesAdapter
import kotlinx.android.synthetic.main.fragment_sub_service_owners.view.*
import kotlinx.android.synthetic.main.fragment_services.view.*
import kotlinx.android.synthetic.main.fragment_sub_services.view.*

/**
 * A simple [Fragment] subclass.
 */
class SubServicesFragment : Fragment() {
    lateinit var subServicesAdapter: SubServicesAdapter
    lateinit var root:View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        if (container != null) {
            container.removeAllViews();
        }
        // Inflate the layout for this fragment
        root= inflater.inflate(R.layout.fragment_sub_services, container, false)
        init()
        SubServicesList()
        return root;
    }

    private fun SubServicesList() {
        root.recyclerSubServices.apply {
            layoutManager= LinearLayoutManager(context)
            subServicesAdapter = SubServicesAdapter(context)
            adapter=subServicesAdapter
        }
    }

    private fun init() {
        val toggle = ActionBarDrawerToggle(
            activity,
            NavigationActivity.drawerLayout,
            root!!.toolbar_sub_services,
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

}
