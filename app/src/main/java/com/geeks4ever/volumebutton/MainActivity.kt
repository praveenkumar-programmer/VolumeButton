package com.geeks4ever.volumebutton

import android.app.Activity
import android.content.Context
import android.media.AudioManager
import android.os.Bundle

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (applicationContext.getSystemService(Context.AUDIO_SERVICE) as AudioManager).adjustVolume(AudioManager.ADJUST_SAME, AudioManager.FLAG_SHOW_UI)
        finish()
    }
}