package com.josh.automationtestapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goToWebViewActivity(view: View){
        val intent = Intent(this, WebViewActivity::class.java)
        startActivity(intent)
    }
}
