package com.motion.motioninlove.login

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.motion.motioninlove.R
import com.motion.motioninlove.home.HomeActivity
import com.motion.motioninlove.register.RegisterActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        initListener()
    }

    fun initListener(){
        tvLoginRegister.setOnClickListener{
            RegisterActivity.startActivity(this)
        }

        btnLogin.setOnClickListener {
            HomeActivity.startActivity(this)
        }
    }

    companion object {
        fun startActivity(context: Context){
            context.startActivity(Intent(context,LoginActivity::class.java))
        }
    }
}
