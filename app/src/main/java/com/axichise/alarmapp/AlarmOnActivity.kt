package com.axichise.alarmapp

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AlarmOnActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarm_on)

        var mp = MediaPlayer.create(applicationContext,R.raw.alarm)
        mp.start()

        var stopButton = findViewById<Button>(R.id.btn2)
        stopButton.setOnClickListener {
            mp.stop()
        }
    }
}