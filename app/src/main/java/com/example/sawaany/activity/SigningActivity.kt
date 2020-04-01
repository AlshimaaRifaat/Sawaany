package com.example.sawaany.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.sawaany.R
import com.example.sawaany.fragment.LoginFragment

class SigningActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signing)
        replaceFragment(LoginFragment())
    }
}

fun AppCompatActivity.replaceFragment(fragment: Fragment){
    val fragmentManager = supportFragmentManager
    val transaction = fragmentManager.beginTransaction()
    transaction.replace(R.id.signing_container,fragment)
    transaction.addToBackStack(null)
    transaction.commit()
}
