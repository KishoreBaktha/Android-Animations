package com.example.animation

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import com.example.animation.R
import kotlinx.android.synthetic.main.activity_animate_drawable.*

class AnimateDrawableActivity : AppCompatActivity() {

    lateinit var batteryAnimation:AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animate_drawable)

    }

    override fun onStart() {
        super.onStart()
        targetImage.setBackgroundResource(R.drawable.battery_animation_list)
        batteryAnimation = targetImage.background as AnimationDrawable
        batteryAnimation.start()
    }
    // Button click event handler
    fun startStopAnimation(view: View) {
      if(batteryAnimation.isRunning) batteryAnimation.stop()
        else batteryAnimation.start()
    }
}
