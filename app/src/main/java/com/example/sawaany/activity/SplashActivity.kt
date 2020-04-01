package com.example.sawaany.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sawaany.R
import com.example.sawaany.fragment.SplashFragment

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        supportFragmentManager.takeIf { savedInstanceState == null }
            ?.beginTransaction()
            ?.replace(R.id.container,
                SplashFragment()
            )
            ?.commitNow()

    }
}
