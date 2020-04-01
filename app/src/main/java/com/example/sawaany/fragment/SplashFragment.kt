package com.example.sawaany.fragment


import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.sawaany.R
import com.example.sawaany.activity.SigningActivity
import com.example.sawaany.goTo

//import com.example.sawaany.stackFragment


/**
 * A simple [Fragment] subclass.
 */
class SplashFragment : Fragment() {
    lateinit var root:View


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        root= inflater.inflate(R.layout.fragment_splash, container, false)
        Handler().postDelayed(
            {
               activity!!.goTo(SigningActivity())
                activity!!.finish()
               // replaceFragment(LoginFragment())
               /* fragmentManager!!.beginTransaction().replace(R.id.splash_frameLayout_container, LoginFragment())
                    .addToBackStack(null).commit()*/
            },3000
        )
        return root
    }


}
