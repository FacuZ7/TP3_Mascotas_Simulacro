package com.example.tp3_mascotas_simulacro.splashscreen.activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.tp3_mascotas_simulacro.MainActivity
import com.example.tp3_mascotas_simulacro.R
import com.example.tp3_mascotas_simulacro.adapters.ViewPagerAdapter

class SplashScreen : AppCompatActivity() {

    private lateinit var viewPager: ViewPager2
    private lateinit var progressBar: ProgressBar
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_splash_screen)

        viewPager = findViewById(R.id.viewPager)
        progressBar = findViewById(R.id.ss_progessBar)
        button = findViewById(R.id.button)

        viewPager.adapter = ViewPagerAdapter(this)

        button.visibility = View.GONE

        Handler().postDelayed({
            // Ocultar el progress bar y mostrar el botón
            progressBar.visibility = View.GONE
            button.visibility = View.VISIBLE
        }, 5000)

        button.setOnClickListener {
            // Navegar a la home de la app
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}