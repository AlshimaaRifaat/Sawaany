package com.example.sawaany.fragment



import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.sawaany.R
import com.example.sawaany.activity.NavigationHomeActivity
import com.example.sawaany.goTo
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.fragment_login.view.*








/**
 * A simple [Fragment] subclass.
 */
class LoginFragment : Fragment(){
    lateinit var root:View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        root= inflater.inflate(R.layout.fragment_login, container, false)

        root.T_new_account.setOnClickListener { view -> replaceFragment(RegisterFragment()) }
        root.card_btn_login.setOnClickListener { view -> activity!!.goTo(NavigationHomeActivity()) }
        return root
    }

    fun replaceFragment(fragment: Fragment){
        fragmentManager!!.beginTransaction().replace(R.id.constraint_login_container, fragment)
            .addToBackStack(null).commit()


    }
}
