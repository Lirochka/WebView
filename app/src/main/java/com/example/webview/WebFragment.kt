package com.example.webview

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebResourceError
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import com.example.webview.databinding.FragmentWebBinding

class WebFragment : Fragment() {

    private var _binding: FragmentWebBinding? = null
    private val binding: FragmentWebBinding
        get() = _binding ?: throw RuntimeException("FragmentWebBinding = null")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentWebBinding.inflate(inflater, container, false)
        return binding.root
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        setUpWebView()
    }

   @RequiresApi(Build.VERSION_CODES.O)
   private fun setUpWebView(){
       binding.wbv.webViewClient = WebViewClient()

       binding.wbv.apply {

           loadUrl("https://developer.android.com/")
           settings.javaScriptEnabled = true
           settings.safeBrowsingEnabled = true
       }
   }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}