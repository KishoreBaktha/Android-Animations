package com.example.animation

import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintSet
import androidx.appcompat.app.AppCompatActivity
import android.transition.ChangeBounds
import android.transition.TransitionManager
import android.view.animation.AnticipateOvershootInterpolator
import kotlinx.android.synthetic.main.activity_constraint_layout_animation.*

class ConstraintLayoutAnimationActivity : AppCompatActivity() {

    private var isDetailLayout = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint_layout_animation)

        constraintLayout.setOnClickListener {
            if (isDetailLayout)
                swapFrames(R.layout.activity_constraint_layout_animation)
            else
                swapFrames(R.layout.activity_constraint_layout_animation_detail)
            // switch to detail layout
        }
    }

    private fun swapFrames(layoutId: Int) {
        val constraintSet = ConstraintSet()
        constraintSet.clone(this, layoutId)

        val transition = ChangeBounds()
        transition.interpolator = AnticipateOvershootInterpolator(1.0f)
        transition.duration = 1200

        TransitionManager.beginDelayedTransition(constraintLayout, transition)
        constraintSet.applyTo(constraintLayout)
        isDetailLayout = !isDetailLayout

    }
}

