package com.example.animation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.transition.*
import android.view.Gravity
import android.view.View
import kotlinx.android.synthetic.main.activity_transition.*

class TransitionActivity : AppCompatActivity() {

    private lateinit var scene1: Scene
    private lateinit var scene2: Scene
    private lateinit var currentScene: Scene
    private lateinit var transition: Transition
    lateinit var transitionSet: TransitionSet
    private var visibility = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transition)

        // Step 1: Create a Scene object for both the starting and ending layout
//        scene1 = Scene.getSceneForLayout(sceneRoot, R.layout.scene1, this)
//        scene2 = Scene.getSceneForLayout(sceneRoot, R.layout.scene2, this)
//
//
//        // Step 2: Create a Transition object to define what type of animation you want
//
//       // transition = TransitionInflater.from(this).inflateTransition(R.transition.example_4)
//
//        val cbTransition = ChangeBounds()
//        cbTransition.duration = 500
//        cbTransition.interpolator = LinearInterpolator()
//
//        val fadeInTransition = Fade(Fade.IN)
//        fadeInTransition.duration = 250
//        fadeInTransition.startDelay = 400
//        fadeInTransition.addTarget(R.id.txvTitle)
//
//        val fadeOutTransition = Fade(Fade.OUT)
//        fadeOutTransition.duration = 50
//        fadeOutTransition.addTarget(R.id.txvTitle)
//
//
//        transitionSet = TransitionSet()
//        transitionSet.ordering = TransitionSet.ORDERING_TOGETHER
//
//        transitionSet.addTransition(cbTransition)
//        transitionSet.addTransition(fadeInTransition)
//        transitionSet.addTransition(fadeOutTransition)
//
//        scene1.enter()
//        currentScene = scene1
    }

//    fun onClick(view: View) {
//
//        // Step 3: Call TransitionManager.go() to run animation
//        currentScene = if(currentScene ==scene1){
//           // TransitionManager.go(scene2,transition)
//            TransitionManager.go(scene2,transitionSet)
//            scene2
//        } else{
//           // TransitionManager.go(scene1,transition)
//            TransitionManager.go(scene1,transitionSet)
//            scene1
//        }
//
//    }

    fun fadeAnimation(view: View) {
        val transition = Fade()
        TransitionManager.beginDelayedTransition(sceneRoot, transition)
        txvDescription.visibility = if (visibility) View.INVISIBLE else View.VISIBLE
        visibility = !visibility
    }

    fun slideEffect(view: View) {

        val transition = Slide(Gravity.END)
        TransitionManager.beginDelayedTransition(sceneRoot, transition)

        txvDescription.visibility = if (visibility) View.INVISIBLE else View.VISIBLE
        visibility = !visibility
    }
}

