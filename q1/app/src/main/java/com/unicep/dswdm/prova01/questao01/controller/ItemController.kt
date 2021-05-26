package com.unicep.dswdm.prova01.questao01.controller

import android.util.Log
import androidx.lifecycle.ViewModel
import com.unicep.dswdm.prova01.questao01.model.ItemModel
import kotlin.random.Random

class ItemController: ViewModel() {

    fun loadRandomItems() {
        Log.e("_ItemController", "Lista (Aleatória) de 1 a 1000")
        Log.e("_loadRandomItems", "${ makeRandomItems() }")
    }

        private fun makeRandomItems(): ItemModel {
        val randomItem = List(1000) { Random.nextInt(1, 1000) }
        return ItemModel(randomItem)
    }

}