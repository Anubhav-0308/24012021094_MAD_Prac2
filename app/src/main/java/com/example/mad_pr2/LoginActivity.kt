package com.example.mad_pr2

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    var TAG ="LoginActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        display(msg = "OnCreate method is called")
    }

    override fun onStart() {
        display(msg = "OnStart method is called")
        super.onStart()
    }

    override fun onPause() {
        display(msg = "OnPause method is called")
        super.onPause()
    }

    override fun onResume() {
        display(msg="OnResume method is called")
        super.onResume()
    }

    override fun onRestart() {
        display(msg="OnRestart method is called")
        super.onRestart()
    }



    fun display(msg:String){
        Log.i(TAG,msg)
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}

