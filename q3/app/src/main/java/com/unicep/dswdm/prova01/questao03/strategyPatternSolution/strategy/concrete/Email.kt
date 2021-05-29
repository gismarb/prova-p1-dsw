package com.unicep.dswdm.prova01.questao03.strategyPatternSolution.strategy.concrete

import android.os.Build
import androidx.annotation.RequiresApi
import com.unicep.dswdm.prova01.questao03.strategyPatternSolution.strategy.`interface`.Document
import com.unicep.dswdm.prova01.questao03.strategyPatternSolution.strategy.`interface`.EmailInterface
import java.time.LocalDate

class Email : Document, EmailInterface{
    private var authors: ArrayList<String> = arrayListOf()
    @RequiresApi(Build.VERSION_CODES.O)
    private var date: LocalDate = LocalDate.now()
    private var subject: String = ""
    private var to: ArrayList<String> = arrayListOf()

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
        TODO("Not yet implemented")
    }

    override fun setTitle(title: String) {
        TODO("Not yet implemented")
    }

    override fun getSubject(): String {
        return this.subject
    }

    override fun setSubject(subject: String) {
        this.subject = subject
    }

    override fun getTo(): ArrayList<String> {
        return this.to
    }

    override fun setTo(to: String) {
        this.to.add(to)
    }
}