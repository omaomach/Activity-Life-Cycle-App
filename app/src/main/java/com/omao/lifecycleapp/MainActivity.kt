package com.omao.lifecycleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this,
            "onCreate() is Called",
            Toast.LENGTH_LONG).show()
    }

    override fun onResume() {  // called when the activity starts interacting with the user
        super.onResume()

        Toast.makeText(this,
            "onResume() is Called",
            Toast.LENGTH_LONG).show()

    }

    override fun onStart() {
        super.onStart()

        Toast.makeText(this,
            "onStart() is Called",
            Toast.LENGTH_LONG).show()

    }

}