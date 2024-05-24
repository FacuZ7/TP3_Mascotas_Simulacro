package com.example.tp3_mascotas_simulacro.splashscreen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.tp3_mascotas_simulacro.MainActivity
import com.example.tp3_mascotas_simulacro.R

class SplashScreen : AppCompatActivity() {

    lateinit var fragmentList: ArrayList<Fragment>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_splash_screen)


        //Handler().postDelayed({
        //   var intent = Intent(this, MainActivity::class.java)
        //    startActivity(intent)
        //    finish()
        //}, 10000)
    }
}