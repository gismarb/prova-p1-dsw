package com.unicep.dswdm.prova01.questao01.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.unicep.dswdm.prova01.questao01.R
import com.unicep.dswdm.prova01.questao01.controller.ItemController

class ItemView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewModel: ItemController by viewModels()

        viewModel.loadRandomItems()
    }
}