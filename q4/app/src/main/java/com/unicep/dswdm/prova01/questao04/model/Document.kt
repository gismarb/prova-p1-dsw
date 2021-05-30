package com.unicep.dswdm.prova01.questao04.model

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate

abstract class Document {
    private var authors: ArrayList<String> = arrayListOf()
    @RequiresApi(Build.VERSION_CODES.O)
    private var date: LocalDate = LocalDate.now()

    public fun getAuthors(): ArrayList<String> {
        return this.authors
    }

    public fun addAuthor(name: String) {
        this.authors.add(name)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    public fun getDate(): LocalDate {
        return this.date
    }

    @RequiresApi(Build.VERSION_CODES.O)
    public fun setDate(date: LocalDate) {
        this.date = date
    }

}