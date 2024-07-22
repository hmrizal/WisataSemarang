package com.example.wisatasemarang

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListWisataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_wisata)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewWisata)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = WisataAdapter(WisataData.wisataList) { wisata ->
            val intent = Intent(this, DetailWisataActivity::class.java)
            intent.putExtra("WISATA", wisata)
            startActivity(intent)
        }
    }
}

class WisataAdapter(
    private val wisataList: List<WisataData.Wisata>,
    private val onItemClick: (WisataData.Wisata) -> Unit
) : RecyclerView.Adapter<WisataAdapter.WisataViewHolder>() {

    class WisataViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.imageViewWisata)
        val textViewNama: TextView = view.findViewById(R.id.textViewNamaWisata)
        val textViewDeskripsi: TextView = view.findViewById(R.id.textViewDeskripsiWisata)
        val buttonDetail: Button = view.findViewById(R.id.buttonDetail)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WisataViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_wisata, parent, false)
        return WisataViewHolder(view)
    }

    override fun onBindViewHolder(holder: WisataViewHolder, position: Int) {
        val wisata = wisataList[position]
        holder.imageView.setImageResource(wisata.imageResId)
        holder.textViewNama.text = wisata.nama
        holder.textViewDeskripsi.text = wisata.deskripsiSingkat
        holder.buttonDetail.setOnClickListener { onItemClick(wisata) }
    }

    override fun getItemCount() = wisataList.size
}