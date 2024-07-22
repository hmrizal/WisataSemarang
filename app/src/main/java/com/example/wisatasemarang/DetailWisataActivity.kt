package com.example.wisatasemarang

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailWisataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_wisata)

        val wisata = intent.getSerializableExtra("WISATA") as WisataData.Wisata

        findViewById<ImageView>(R.id.imageViewDetailWisata).setImageResource(wisata.imageResId)
        findViewById<TextView>(R.id.textViewNamaWisata).text = wisata.nama
        findViewById<TextView>(R.id.textViewHargaTiket).text = wisata.hargaTiket
        findViewById<TextView>(R.id.textViewDetailWisata).text = wisata.deskripsiLengkap

        findViewById<Button>(R.id.buttonLihatPeta).setOnClickListener {
            val gmmIntentUri = Uri.parse("geo:0,0?q=${Uri.encode(wisata.nama)}")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
    }
}