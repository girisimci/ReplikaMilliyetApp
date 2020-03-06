package com.example.replikamilliyetapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.replikamilliyetapp.R
import com.example.replikamilliyetapp.ui.adapter.WriterListAdepter
import com.example.replikamilliyetapp.ui.mock.mockList
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rcycWriterList.adapter = WriterListAdepter(mockList.getMockedWriterList())
        rcycWriterList.layoutManager = LinearLayoutManager(this)



    }
}
