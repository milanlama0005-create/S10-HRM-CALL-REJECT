package com.example.s10hrmcallreject

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.TextView
import android.widget.LinearLayout

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setPadding(32, 32, 32, 32)

        val title = TextView(this)
        title.text = "S10 HRM Call Reject"
        title.textSize = 24f
        title.setTextColor(Color.BLACK)
        title.gravity = Gravity.CENTER

        val status = TextView(this)
        status.text =
            "Experimental app\n\nSensor detection and call rejection are not tested yet."
        status.textSize = 17f
        status.gravity = Gravity.CENTER
        status.setPadding(0, 24, 0, 0)

        layout.addView(title)
        layout.addView(status)

        setContentView(layout)
    }
}
