package com.axichise.alarmapp

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.btn)
        val editText = findViewById<EditText>(R.id.tv2)
        button.setOnClickListener{
            var sec: Int = editText.text.toString().toInt()
            var i = Intent(applicationContext, MyBroadcastReciver::class.java)
            var pi: PendingIntent = PendingIntent.getBroadcast(applicationContext,11,i,PendingIntent.FLAG_IMMUTABLE)
            var am = getSystemService(Context.ALARM_SERVICE) as AlarmManager
            am.set(AlarmManager.RTC_WAKEUP,System.currentTimeMillis() + (sec*1000),pi)
            Toast.makeText(applicationContext, "Alarm is set for $sec seconds", Toast.LENGTH_LONG).show()
        }
    }
}