package com.example.wisatasemarang

object WisataData {
    data class Wisata(
        val nama: String,
        val deskripsiSingkat: String,
        val deskripsiLengkap: String,
        val hargaTiket: String,
        val imageResId: Int
    ) : java.io.Serializable

    val wisataList = listOf(
        Wisata(
            "Lawang Sewu",
            "Bangunan bersejarah dengan 1000 pintu",
            "Lawang Sewu adalah bangunan bersejarah peninggalan Belanda yang terletak di Semarang. Dikenal dengan arsitektur yang megah dan memiliki banyak pintu, Lawang Sewu menjadi salah satu ikon wisata Kota Semarang yang wajib dikunjungi.",
            "Rp 10.000",
            R.drawable.lawang_sewu
        ),
        Wisata(
            "Sam Poo Kong",
            "Klenteng bersejarah dengan arsitektur unik",
            "Sam Poo Kong adalah klenteng tertua di Semarang yang didedikasikan untuk Laksamana Cheng Ho. Klenteng ini memadukan arsitektur Tionghoa, Jawa, dan Arab, mencerminkan keberagaman budaya di Semarang.",
            "Rp 15.000",
            R.drawable.sam_poo_kong
        ),
        Wisata(
            "Kota Lama",
            "Kawasan bersejarah dengan bangunan kolonial",
            "Kota Lama Semarang adalah kawasan bersejarah yang menyimpan pesona arsitektur kolonial Belanda. Pengunjung dapat menikmati suasana nostalgik sambil menjelajahi bangunan-bangunan tua yang telah direvitalisasi.",
            "Gratis",
            R.drawable.kota_lama
        ),
        Wisata(
            "Masjid Agung Jawa Tengah",
            "Salah satu masjid terbesar di Indonesia",
            "Masjid Agung Jawa Tengah adalah salah satu masjid terbesar di Indonesia dan merupakan contoh arsitektur Islam modern yang menakjubkan.Dengan kubah besar, kolam refleksi yang indah, dan berbagai hiasan seni, masjid ini menjadi tempat yang populer bagi wisatawan lokal maupun internasional",
            "Rp 3.000 - Rp 5.000",
            R.drawable.majt
        ),
        Wisata(
            "Goa Kreo",
            "Goa alami dengan legenda menarik",
            "Goa Kreo adalah goa alami yang terletak di perbukitan Semarang. Selain keindahan alamnya, tempat ini juga memiliki legenda menarik tentang Sunan Kalijaga dan sekawanan kera yang membantunya membangun Masjid Demak.",
            "Rp 5.000",
            R.drawable.goa_kreo
        )
    )
}