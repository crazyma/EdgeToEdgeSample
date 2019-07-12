package com.beibeilab.edgetoedgesample

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_no_status_activity_4.*
import android.view.ViewGroup
import androidx.core.view.ViewCompat

class NoStatusBarActivity4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_no_status_activity_4)

        this.findViewById<View>(android.R.id.content).systemUiVisibility =
            (View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_LAYOUT_STABLE)


        ViewCompat.setOnApplyWindowInsetsListener(toolbar) { v, insets ->
            val params = v.layoutParams as ViewGroup.MarginLayoutParams
            params.topMargin = insets.systemWindowInsetTop
            insets.consumeSystemWindowInsets()
        }

    }

}