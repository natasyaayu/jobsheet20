package com.example.natasya20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val list = ArrayList<siswa>()
    val listnama = arrayOf(
        "MIFTAKHUL JANNAH",
        "MUH ASA SUSILO FARIKH SAKTI",
        "MUHAMMAD HAIKAL",
        "MUHAMMAD RIFQIL KHANIF",
        "NABHAN AFLAHU SYAFIQ",
        "NATASYA AYU LESTANTI",
        "NOVI INDRIYNANI",
        "NUR HESTI MUGI RAHAYU",
        "RIKA RAHMA AULIA",
        "SALMA NADIA AGUSTINA",
        "SALMA VILINDIA PUTRI"
    )

    val listNis = arrayOf(
        "3010",
        "3011",
        "3013",
        "3015",
        "3017",
        "3019",
        "3021",
        "3023",
        "3025",
        "3028",
        "3029"
    )

    lateinit var makananView: RecyclerView
    lateinit var  makananAdapter: makananAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        makananView = findViewById(R.id.nama)
        makananView.layoutManager = LinearLayoutManager( this)

        for (i in listnama.indices){
            list.add(siswa(listnama[i], listNis[i]))
    }

        makananAdapter = makananAdapter(list)
        makananAdapter.notifyDataSetChanged()
        makananView.adapter = makananAdapter
    }
}
