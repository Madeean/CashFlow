package com.madeean.cashflow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.madeean.cashflow.adapter.HomePageAdapter

class HomePage : AppCompatActivity() {
    lateinit var recycleView: RecyclerView
    lateinit var listData: ArrayList<String>
    lateinit var adapter: HomePageAdapter

    lateinit var fab_homepage:FloatingActionButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        recycleView = findViewById(R.id.rv_home)
        recycleView.layoutManager = LinearLayoutManager(this)
        listData = ArrayList()
        listData.clear()
        for (i in 1..10) {
            listData.add("Data ke $i")
        }
        adapter = HomePageAdapter(listData, this)
        recycleView.adapter = adapter
        adapter.notifyDataSetChanged()


        fab_homepage = findViewById(R.id.fab_homepage)
        fab_homepage.setOnClickListener {
            val intent = Intent(this@HomePage, AddPage::class.java)
            startActivity(intent)
        }


    }
}