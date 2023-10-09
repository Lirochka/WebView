package com.example.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.webview.Navigation.navigateToFragmentFromActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigateToFragmentFromActivity(activity = this, fragment = MainFragment())
    }
}