package com.example.s10hrmcallreject

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorManager
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setPadding(28, 28, 28, 28)

        val title = TextView(this)
        title.text = "S10 HRM Call Reject"
        title.textSize = 24f
        title.setTextColor(Color.BLACK)
        title.gravity = Gravity.CENTER

        val status = TextView(this)
        status.textSize = 17f
        status.setTextColor(Color.DKGRAY)
        status.gravity = Gravity.CENTER
        status.setPadding(0, 24, 0, 0)

        val sensorManager =
            getSystemService(Context.SENSOR_SERVICE) as SensorManager

        val heartRateSensor =
            sensorManager.getDefaultSensor(Sensor.TYPE_HEART_RATE)

        status.text = if (heartRateSensor != null) {
            "HRM sensor detected.\n\n" +
            "Rear sensor tap detection is not confirmed.\n" +
            "Call rejection setup is still required."
        } else {
            "No standard heart-rate sensor detected.\n\n" +
            "This does not prove that the phone has no HRM hardware."
        }

        layout.addView(title)
        layout.addView(status)

        setContentView(layout)
    }
}
