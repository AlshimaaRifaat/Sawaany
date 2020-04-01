package com.example.sawaany.model

import android.content.Context
import com.example.sawaany.R


data class SideNavModel(var itemName: String)
object SideNavInteractions {
    fun setNavItems(context: Context): ArrayList<SideNavModel> {
        val items = ArrayList<SideNavModel>()


        items.add(SideNavModel(context.getString(R.string.home)))
        items.add(SideNavModel(context.getString(R.string.signing)))
        /*items.add(SideNavModel(context.getString(R.string.faq)))
        items.add(SideNavModel(context.getString(R.string.protection_measures)))
        items.add(SideNavModel(context.getString(R.string.home_isolation)))
        items.add(SideNavModel(context.getString(R.string.stay_at_home)))
        items.add(SideNavModel(context.getString(R.string.references)))*/
        return items
    }




}