package com.example.kotlin_view_binding

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.kotlin_view_binding.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var secondxml:ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_main2)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

        secondxml= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(secondxml.root)
        secondxml.button3.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        secondxml.button2.setOnClickListener{
            secondxml.textView2.setText(" this text is updated after the button is clicked")
        }




    }
}