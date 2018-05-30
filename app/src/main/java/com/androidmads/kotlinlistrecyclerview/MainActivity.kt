package com.androidmads.kotlinlistrecyclerview

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.AppCompatButton
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<AppCompatButton>(R.id.btnListView).setOnClickListener {
            startActivity(Intent(applicationContext, ListViewActivity::class.java))
        }

        findViewById<AppCompatButton>(R.id.btnRecView).setOnClickListener {
            startActivity(Intent(applicationContext, RecyclerViewActivity::class.java))
        }
    }
}
