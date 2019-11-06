package com.motion.motioninlove.register

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.motion.motioninlove.R
import com.motion.motioninlove.home.HomeActivity
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        initToolbar()
        initListener()
    }

    fun initToolbar(){
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        toolbar.setNavigationOnClickListener {
            onBackPressed()
        }
    }

    fun initListener(){
        btnRegister.setOnClickListener{
            //TODO : Put Action Here!
            HomeActivity.startActivity(this)
        }

        tvRegisterLogin.setOnClickListener {
            onBackPressed()
        }
    }

    companion object {
        fun startActivity(context: Context){
            context.startActivity(Intent(context,RegisterActivity::class.java))
        }
    }
}
