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
    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this,
            "onRestart() is Called",
            Toast.LENGTH_LONG).show()
    }
    override fun onPause() {
        super.onPause()
        Toast.makeText(this,
            "onPause() is Called",
            Toast.LENGTH_LONG).show()
    }
    override fun onStop() {  // called when an activity is not visible to the user and is followed by onRestart() when the revoked from the background
        super.onStop()
        Toast.makeText(this,
            "onStop() is Called",
            Toast.LENGTH_LONG).show()
    } // its followed by onDestroy() when an activity is closed or finished
    override fun onDestroy() { // called when the final call received before the activity is destroyed
        super.onDestroy()
        Toast.makeText(this,
            "onDestroy() is Called",
            Toast.LENGTH_LONG).show()
    }

}