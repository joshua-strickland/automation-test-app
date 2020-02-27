package com.josh.automationtestapp

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_web_view.*
import kotlinx.android.synthetic.main.content_web_view.*

class WebViewActivity : AppCompatActivity() {
    //This activity was made to see how appium handles multiple webviews.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)
        setSupportActionBar(toolbar)

        webView1.loadUrl("https://www.google.com/")
        webView2.loadUrl("https://www.cnn.com/")


    }

}
