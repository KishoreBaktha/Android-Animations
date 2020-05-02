package com.example.animation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import jp.wasabeef.recyclerview.adapters.ScaleInAnimationAdapter
import jp.wasabeef.recyclerview.animators.OvershootInRightAnimator
import jp.wasabeef.recyclerview.animators.ScaleInBottomAnimator
import kotlinx.android.synthetic.main.activity_open_source_library.*

class OpenSourceLibraryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_open_source_library)
        setUpRecyclerView()
    }

    private fun setUpRecyclerView() {

        val adapter = RecyclerAdapter(this, Landscape.data)
        recyclerView.adapter = ScaleInAnimationAdapter(adapter)

        val layoutManager =
            LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager

        recyclerView.itemAnimator = OvershootInRightAnimator()
        recyclerView.itemAnimator?.apply {
            addDuration = 500
            removeDuration = 500
        }
    }
}


