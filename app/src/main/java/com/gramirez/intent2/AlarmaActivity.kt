package com.gramirez.intent2

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.provider.AlarmClock
import android.widget.Button
import android.widget.EditText
import android.widget.TimePicker

class AlarmaActivity : Activity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.alarm_activity)

        val saveAlarm = findViewById<Button>(R.id.saveAlarm)

        saveAlarm.setOnClickListener {

            val alarmNameView = findViewById<EditText>(R.id.alarmName)
            val alarmHourView = findViewById<TimePicker>(R.id.alarmHour)

            val alarmName = alarmNameView.text.toString()
            val alarmHour = alarmHourView.hour
            val alarmMinute = alarmHourView.minute

            val intent = Intent(AlarmClock.ACTION_SET_ALARM).apply {
                putExtra(AlarmClock.EXTRA_MESSAGE, alarmName)
                putExtra(AlarmClock.EXTRA_HOUR, alarmHour)
                putExtra(AlarmClock.EXTRA_MINUTES, alarmMinute)
            }
            startActivity(intent)
            finish()
        }
    }
}

