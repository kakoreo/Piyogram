package com.example.piyogram.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.piyogram.Adapters.TopAdapter
import com.example.piyogram.R
import com.example.piyogram.Services.TopContentService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: TopAdapter
    lateinit var layoutManager : LinearLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = TopAdapter(this, TopContentService().getTopContent())
        layoutManager = LinearLayoutManager(this)
        topRecyclerView.layoutManager = layoutManager
        topRecyclerView.adapter = adapter
    }
}
