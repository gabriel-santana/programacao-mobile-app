package com.example.gabrieleluanprojetomobile.widgets.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.gabrieleluanprojetomobile.model.Ong
import com.example.gabrieleluanprojetomobile.util.GlideApp
import com.example.gabrieleluanprojetomobile.R
import com.example.gabrieleluanprojetomobile.databinding.ItemOngBinding

class OngAdapter(var ongs: List<Ong>, var evento: OngAdapter.Evento) : RecyclerView.Adapter<OngAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemOngBinding.inflate(layoutInflater)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ong = ongs[position]


        holder.binding.txtTitulo.text = ong.nome
        holder.binding.txtDescricao.text = ong.desc


        holder.binding.btnCompartilhar.setOnClickListener { evento.onCompartilharClick(ong) }
        holder.binding.btnDetalhes.setOnClickListener { evento.onDetalhesClick(ong) }


        GlideApp.with(holder.binding.root)
            .load(ong.imagem)
            .placeholder(R.drawable.ic_launcher_background)
            .circleCrop()
            .into(holder.binding.imageView)
    }

    override fun getItemCount(): Int {
        return ongs.size
    }


    interface Evento {
        fun onCompartilharClick(ong: Ong)
        fun onDetalhesClick(ong: Ong)
    }

    //
    data class ViewHolder(var binding: ItemOngBinding) : RecyclerView.ViewHolder(binding.root)

}
