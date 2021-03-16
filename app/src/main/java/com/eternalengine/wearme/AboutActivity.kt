package com.eternalengine.wearme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        val tvAvatar: ImageView = findViewById(R.id.avatar)

        Glide.with(this)
            .load(R.drawable.avatar)
            .apply(RequestOptions().override(200, 200))
            .into(tvAvatar)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}