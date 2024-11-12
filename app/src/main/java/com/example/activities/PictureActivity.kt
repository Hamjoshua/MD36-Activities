package com.example.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide

class PictureActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture)

        val link: String = this.intent.getStringExtra("picLink").toString();
        val imageView: ImageView = findViewById(R.id.picView);
        Glide.with(this).load(link).into(imageView)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.add_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here.
        val id = item.getItemId()

        if (id == R.id.heart_action) {
            Toast.makeText(this, "Добавлено в избранное", Toast.LENGTH_SHORT).show()
            return true
        }
        if (id == R.id.heart_toolbar) {
            Toast.makeText(this, "Добавлено в избранное", Toast.LENGTH_SHORT).show()
            return true
        }
        return super.onOptionsItemSelected(item)

    }
}