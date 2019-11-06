package com.motion.motioninlove.profile

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.motion.motioninlove.R

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
    }

    companion object {
        fun startActivity(context: Context){
            context.startActivity(Intent(context,ProfileActivity::class.java))
        }
    }
}
