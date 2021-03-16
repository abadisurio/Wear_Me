package com.eternalengine.wearme

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat

class MoveWithDataActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        const val EXTRA_AGE = "extra_age"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_WEAR = "extra_wear"
        var wearName = ""
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        setContentView(R.layout.activity_move_with_data)

        val tvTitleReceived: TextView = findViewById(R.id.tv_main_title)
        val tvDetailReceived: TextView = findViewById(R.id.tv_detail)
        val tvImageReceived: ImageView = findViewById(R.id.img_item_photo)
        val tvFirstSubtitleReceived: TextView = findViewById(R.id.tv_first_subtitle)
        val tvFirstLastReceived: TextView = findViewById(R.id.tv_last_subtitle)

        val btnExplore: Button = findViewById(R.id.button_explore)
        btnExplore.setOnClickListener(this)

        val btnShare: Button = findViewById(R.id.button_share)
        btnShare.setOnClickListener(this)

        val wear = intent.getParcelableExtra<Wear>(EXTRA_WEAR) as Wear
        wearName = wear.name
        tvTitleReceived.text = wear.name
        tvDetailReceived.text = wear.detail
        tvFirstSubtitleReceived.text = wear.firstSubtitle
        tvFirstSubtitleReceived.typeface = ResourcesCompat.getFont(this, R.font.open_sans_bold_italic)
        tvFirstLastReceived.text = wear.lastSubtitle
        tvFirstLastReceived.typeface = ResourcesCompat.getFont(this, R.font.open_sans_bold_italic)

        tvImageReceived.setBackgroundResource(wear.photo)

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.button_explore -> {
                Log.d("hehe")
//                val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com/search?q=$wearName"))
//                val b = Bundle()
//                b.putBoolean("new_window", true)
//                browserIntent.putExtras(b)
//                startActivity(browserIntent)
            }
            R.id.button_share -> {
                Log.d("testing")

//                val sendIntent: Intent = Intent().apply {
//                    action = Intent.ACTION_SEND
//                    putExtra(Intent.EXTRA_TEXT, "Lihat produk $wearName di Aplikasi Wear Me sekarang!")
//                    type = "text/plain"
//                }
//
//                val shareIntent = Intent.createChooser(sendIntent, null)
//                startActivity(shareIntent)
            }
        }
    }
}