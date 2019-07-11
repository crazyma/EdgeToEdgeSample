package com.beibeilab.edgetoedgesample

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class EdgeToEdgeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edge_to_edge)

        this.findViewById<View>(android.R.id.content).systemUiVisibility =
            (View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_LAYOUT_STABLE)
    }

    fun buttonClicked(v: View){
        var statusBarHeight = 0
        var navigationBarHeight = 0
        var actionBarHeight = 0

        //  status bar
        val resourceId = resources.getIdentifier("status_bar_height", "dimen", "android")
        if (resourceId > 0) {
            statusBarHeight = resources.getDimensionPixelSize(resourceId)
        }

        //  bottom bar
        val resourceId2 = resources.getIdentifier("navigation_bar_height", "dimen", "android")
        if (resourceId > 0) {
            navigationBarHeight = resources.getDimensionPixelSize(resourceId2)
        }

        // action bar height
        val styledAttributes = theme.obtainStyledAttributes(
            intArrayOf(android.R.attr.actionBarSize)
        )
        actionBarHeight = styledAttributes.getDimension(0, 0f).toInt()
        styledAttributes.recycle()

        Log.d("badu","statusBarHeight: $statusBarHeight")
        Log.d("badu","actionBarHeight: $actionBarHeight")
        Log.d("badu","navigationBarHeight: $navigationBarHeight")
        Log.d("badu", "view width: ${v.width} , height: ${v.height}")
        Log.d("badu","total height : ${statusBarHeight + actionBarHeight + v.height + navigationBarHeight}")
    }

}