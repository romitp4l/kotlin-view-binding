package com.example.kotlin_view_binding

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.kotlin_view_binding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mainxml: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        mainxml = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainxml.root)

        // Set text for the TextView
        mainxml.textView.text = "Here the sample text is being replaced with the new text with the help of the viewBinding"

        // Set OnClickListener for the button
        mainxml.button.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
//
//        // Apply WindowInsets to the root view
//        ViewCompat.setOnApplyWindowInsetsListener(mainxml.root) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
    }
}
