package com.unicep.dswdm.prova01.questao03.strategyPatternSolution.strategy.concrete

import android.os.Build
import androidx.annotation.RequiresApi
import com.unicep.dswdm.prova01.questao03.strategyPatternSolution.strategy.`interface`.BookInterface
import com.unicep.dswdm.prova01.questao03.strategyPatternSolution.strategy.`interface`.Document
import java.time.LocalDate

class Book : Document, BookInterface{
    private var authors: ArrayList<String> = arrayListOf()
    @RequiresApi(Build.VERSION_CODES.O)
    private var date: LocalDate = LocalDate.now()
    private var title: String = ""

    override fun getAuthors(): ArrayList<String> {
        return this.authors
    }

    override fun addAuthors(name: String) {
        this.authors.add(name)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun getDate(): LocalDate {
        return this.date
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun setDate(date: LocalDate) {
        this.date = date
    }

    override fun getTitle(): String {
        return this.title
    }

    override fun setTitle(title: String) {
        this.title = title
    }

    override fun getSubject(): String {
        TODO("Not yet implemented")
    }

    override fun setSubject(subject: String) {
        TODO("Not yet implemented")
    }

    override fun getTo(): ArrayList<String> {
        TODO("Not yet implemented")
    }

    override fun setTo(to: String) {
        TODO("Not yet implemented")
    }
}