package com.example.sawaany

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

fun Context.goTo(dest:AppCompatActivity,key:String="",value:String="")
{
    startActivity(Intent(this,dest::class.java).apply {
        putExtra(key,value)
    })
}


/*fun stackFragment(fragment: Fragment, context: AppCompatActivity, idContainer: Int) {
    context.supportFragmentManager.beginTransaction()
        .replace(idContainer, fragment).addToBackStack(null)
        .commit()

}*/

/*fun stackFragment(fragment: Fragment) {
    AppCompatActivity().supportFragmentManager.beginTransaction()
        .replace(R.id.splash_frameLayout_container, fragment)
        .commit()
}*/
