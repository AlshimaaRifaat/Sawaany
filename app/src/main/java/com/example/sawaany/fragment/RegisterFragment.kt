package com.example.sawaany.fragment



import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.sawaany.R
import androidx.fragment.app.Fragment
/**
 * A simple [Fragment] subclass.
 */
class RegisterFragment : Fragment() {
    lateinit var root:View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        if (container != null) {
            container.removeAllViews();
        }
        root= inflater.inflate(R.layout.fragment_register, container, false)
        return root
    }


}
