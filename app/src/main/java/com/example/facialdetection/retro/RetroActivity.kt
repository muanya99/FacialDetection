package com.example.facialdetection.retro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.facialdetection.R
import com.example.facialdetection.databinding.ActivityRetroBinding

class RetroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityRetroBinding = DataBindingUtil.setContentView(this,
            R.layout.activity_retro
        )
    }
}