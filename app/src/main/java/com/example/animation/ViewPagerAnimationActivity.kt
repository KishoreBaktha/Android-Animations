package com.example.animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.viewpager.widget.ViewPager
import com.example.animation.transformers.*
import kotlinx.android.synthetic.main.activity_view_pager_animation.*

class ViewPagerAnimationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager_animation)
        val imageArray = intArrayOf(
            R.drawable.first, R.drawable.second,
            R.drawable.third, R.drawable.fourth, R.drawable.fifth
        )

        val adapter = ViewPagerAdapter(this@ViewPagerAnimationActivity, imageArray)
        viewPager!!.adapter = adapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val id = item.itemId

        when (id) {

            R.id.zoom_out       -> setPageTransformer(ZoomOutTransformation())
            R.id.depth_page     -> setPageTransformer(DepthPageTransformation())
            R.id.vertical_flip  -> setPageTransformer(VerticalFlipTransformation())
            R.id.fade_out       -> setPageTransformer(FadeOutTransformation())
            R.id.cube_out       -> setPageTransformer(CubeOutDepthTransformation())
            R.id.hinge          -> setPageTransformer(HingeTransformation())
        }

        return super.onOptionsItemSelected(item)
    }

    private fun setPageTransformer(transformer: ViewPager.PageTransformer ) {
        viewPager!!.setPageTransformer(true, transformer)
    }
}
