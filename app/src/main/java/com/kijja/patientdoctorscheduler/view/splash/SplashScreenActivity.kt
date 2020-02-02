package com.kijja.patientdoctorscheduler.view.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.kijja.patientdoctorscheduler.R
import com.kijja.patientdoctorscheduler.view.home.HomePageActivity
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Glide.with(img_loading).load(R.drawable.loading).into(img_loading)
    }

    override fun onResume() {
        super.onResume()

        Handler().postDelayed({
            startActivity(Intent(this, HomePageActivity::class.java))
            finish()
        }, 2000)
    }
}
