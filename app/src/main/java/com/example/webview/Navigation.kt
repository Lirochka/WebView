package com.example.webview

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity


object Navigation {

    fun navigateToFragmentFromActivity(
        activity: AppCompatActivity,
        fragment: Fragment
    ) {
        activity.supportFragmentManager
            .beginTransaction().replace(R.id.fragmentContainer, fragment).commit()
    }

    fun navigateToFragmentFromFragment(
        fragmentActivity: FragmentActivity,
        fragmentTo: Fragment
    ) {
        fragmentActivity.supportFragmentManager
            .beginTransaction().replace(R.id.fragmentContainer, fragmentTo).commit()
    }
}