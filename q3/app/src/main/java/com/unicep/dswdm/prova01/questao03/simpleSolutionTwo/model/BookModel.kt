package com.unicep.dswdm.prova01.questao03.simpleSolutionTwo.model

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate

class BookModel : DocumentModel() {
    override var authors: ArrayList<String> = arrayListOf()
    @RequiresApi(Build.VERSION_CODES.O)
    override var date: LocalDate = LocalDate.now()
    private var title: String = ""

    public override fun getAuthors(): ArrayList<String> {
        return this.authors
    }

    public override fun addAuthors(name: String) {
        this.authors.add(name)
    }

    public override fun getDate(): LocalDate {
        return this.date
    }

    public override fun setDate(date: LocalDate) {
        this.date = date
    }

    public fun getTitle(): String {
        return this.title
    }

    public fun setTitle(title: String){
        this.title = title
    }
}