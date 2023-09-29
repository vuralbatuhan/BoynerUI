package com.example.boynerapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.boynerapp.data.entity.Giyim
import com.example.boynerapp.databinding.ActivityMainBinding
import com.example.boynerapp.ui.adapter.GiyimAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.giyimRv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.HORIZONTAL)

        val giyimListesi = ArrayList<Giyim>()
        val g1 = Giyim(1,"T-SHIRT","tshirt")
        val g2 = Giyim(2,"DERI CEKET","dericeket")
        val g3 = Giyim(3,"AYAKKABI","ayakkabi")
        val g4 = Giyim(4,"GOMLEK","gomlek")
        val g5 = Giyim(5,"MEVSIMLIK CEKET","mevsimlikceket")
        val g6 = Giyim(6,"ESOFMAN","esofman")
        val g7 = Giyim(7,"PANTOLON","jean")
        val g8 = Giyim(8,"GOZLUK","gozluk")

        giyimListesi.add(g1)
        giyimListesi.add(g2)
        giyimListesi.add(g3)
        giyimListesi.add(g4)
        giyimListesi.add(g5)
        giyimListesi.add(g6)
        giyimListesi.add(g7)
        giyimListesi.add(g8)

        val adapter = GiyimAdapter(this.baseContext,giyimListesi)
        binding.giyimRv.adapter = adapter

    }
}