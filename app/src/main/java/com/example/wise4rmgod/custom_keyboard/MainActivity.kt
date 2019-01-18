package com.example.wise4rmgod.custom_keyboard

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // method to disable android soft keyboard
        window.setFlags(
            WindowManager.LayoutParams.FLAG_ALT_FOCUSABLE_IM,
            WindowManager.LayoutParams.FLAG_ALT_FOCUSABLE_IM)
        a1.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            a1.startAnimation(slideup)
           // a1.setBackgroundColor(resources.getColor( R.color.white))
            a1.textSize= 30F
        }
        b2.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            b2.startAnimation(slideup)
          //  b2.setBackgroundColor(resources.getColor( R.color.white))
            b2.textSize= 30F
        }
        c3.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            c3.startAnimation(slideup)
            //  b2.setBackgroundColor(resources.getColor( R.color.white))
            c3.textSize= 30F
        }
        d4.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            d4.startAnimation(slideup)
            //  b2.setBackgroundColor(resources.getColor( R.color.white))
            d4.textSize= 30F
        }
    }
}
