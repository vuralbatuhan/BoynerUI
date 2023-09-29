package com.example.boynerapp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.boynerapp.data.entity.Giyim
import com.example.boynerapp.databinding.CardTasarimBinding

class GiyimAdapter(var mContext:Context, var giyimListesi:List<Giyim>) : RecyclerView.Adapter<GiyimAdapter.CardTasarimTutucu>(){
    inner class CardTasarimTutucu(var tasarim: CardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val binding = CardTasarimBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return CardTasarimTutucu(binding)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val giyim = giyimListesi.get(position)
        val g = holder.tasarim

        g.imageViewCard.setImageResource(mContext.resources.getIdentifier(giyim.resim,"drawable",mContext.packageName))

        g.textViewCard.text = "${giyim.ad}"

    }

    override fun getItemCount(): Int {
        return giyimListesi.size
    }
}