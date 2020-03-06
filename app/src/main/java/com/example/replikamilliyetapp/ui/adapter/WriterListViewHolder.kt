package com.example.replikamilliyetapp.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.replikamilliyetapp.R
import com.example.replikamilliyetapp.ui.model.WriterModel

class WriterListViewHolder(container: ViewGroup) :
    RecyclerView.ViewHolder(
        LayoutInflater.from(container.context).inflate
            (
            R.layout.adap_item_writer_list,
            container,
            false
        )
    ) {


    val txtWriterName: TextView = itemView.findViewById(R.id.txtWriterName)
    val txtWriterEmail: TextView = itemView.findViewById(R.id.txtWriterEmail)
    val txtWriteTitle: TextView = itemView.findViewById(R.id.txtWriteTitle)
    val imgProfilePhoto: ImageView = itemView.findViewById(R.id.imgProfilePhoto)


    fun bind(writerModel: WriterModel) {

        txtWriterName.text = writerModel.writerName
        txtWriterEmail.text = writerModel.writerEmail
        txtWriteTitle.text = writerModel.writeTitle

    }

}