package com.example.animation

import android.graphics.drawable.AnimatedVectorDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_animate_vector.*

class AnimateVectorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animate_vector)

        var isChecked = true

        avdImage.setOnClickListener {

            if (isChecked) {
                avdImage.setImageResource(R.drawable.avd_check_to_close)
                val avdCheckToClose = avdImage.drawable as AnimatedVectorDrawable
                avdCheckToClose.start()
            } else {
                avdImage.setImageResource(R.drawable.avd_close_to_check)
                val avdCheckToClose = avdImage.drawable as AnimatedVectorDrawable
                avdCheckToClose.start()
            }

            isChecked = !isChecked

        }
    }
}
