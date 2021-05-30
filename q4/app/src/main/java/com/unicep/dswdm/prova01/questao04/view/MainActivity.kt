package com.unicep.dswdm.prova01.questao04.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.unicep.dswdm.prova01.questao04.R
import com.unicep.dswdm.prova01.questao04.controller.BookRecyclerAdapter
import com.unicep.dswdm.prova01.questao04.controller.TopSpacingItemDecoration
import com.unicep.dswdm.prova01.questao04.database.DataSourceBooks
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    private lateinit var bookAdapter: BookRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()
        addDataSet()
    }

    private fun addDataSet(){
        val data = DataSourceBooks.createDataSet()
        bookAdapter.submitList(data)
    }

    private fun initRecyclerView(){

        recycler_view.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            val topSpacingDecorator = TopSpacingItemDecoration(30)
            addItemDecoration(topSpacingDecorator)
            bookAdapter = BookRecyclerAdapter()
            adapter = bookAdapter
        }
    }
}