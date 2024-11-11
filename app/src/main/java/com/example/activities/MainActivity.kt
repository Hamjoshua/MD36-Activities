package com.example.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn: Button = findViewById(R.id.btn_show_pic);
        btn.setOnClickListener{
            val newIntent = Intent(this, PictureActivity::class.java)
            newIntent.putExtra("picLink", "https://i0.wp.com/thinklandscape.globallan" +
                    "dscapesforum.org/wp-content/uploads/2023/05/OceanF" +
                    "acts_crop.jpg?fit=1920%2C721&ssl=1")
            startActivity(newIntent)
        }
    }
}