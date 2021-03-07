package com.example.cardview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cardview.adapter.ItemAdapter
import com.example.cardview.data.Datasource
import com.example.cardview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myDataset = Datasource().loadAffirmations()
        val recyclerView = binding.recView
        recyclerView.adapter = ItemAdapter(this, myDataset)
        recyclerView.setHasFixedSize(true)
    }
}