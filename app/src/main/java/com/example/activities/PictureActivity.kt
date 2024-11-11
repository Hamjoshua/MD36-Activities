package com.example.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class PictureActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_picture)

        val link: String = this.intent.getStringExtra("picLink").toString();
        val imageView: ImageView = findViewById(R.id.picView);
        Glide.with(this).load(link).into(imageView)
    }
}