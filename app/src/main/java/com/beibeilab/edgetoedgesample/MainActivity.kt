package com.beibeilab.edgetoedgesample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonClicked(v: View) {
        when (v.id) {
            R.id.edgeToEdgeButton -> {
                startActivity(Intent(this@MainActivity, EdgeToEdgeActivity::class.java))
            }

            R.id.noStatusButton1 -> {
                startActivity(Intent(this@MainActivity, NoStatusBarActivity1::class.java))
            }

            R.id.noStatusButton2 -> {
                startActivity(Intent(this@MainActivity, NoStatusBarActivity2::class.java))
            }

            R.id.noStatusButton3 -> {
                startActivity(Intent(this@MainActivity, NoStatusBarActivity3::class.java))
            }

            R.id.noStatusButton4 -> {
                startActivity(Intent(this@MainActivity, NoStatusBarActivity4::class.java))
            }
        }
    }
}
