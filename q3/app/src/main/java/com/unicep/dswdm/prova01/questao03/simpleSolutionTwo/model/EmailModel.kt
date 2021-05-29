package com.unicep.dswdm.prova01.questao03.simpleSolutionTwo.model

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate

class EmailModel : DocumentModel(){
    override var authors: ArrayList<String> = arrayListOf()
    @RequiresApi(Build.VERSION_CODES.O)
    override var date: LocalDate = LocalDate.now()
    private var subject: String = ""
    private var to: ArrayList<String> = arrayListOf()

    override fun getAuthors(): ArrayList<String> {
        return this.authors
    }

    override fun addAuthors(name: String) {
        this.authors.add(name)
    }

    override fun getDate(): LocalDate {
        return this.date
    }

    override fun setDate(date: LocalDate) {
        this.date = date
    }

    public fun getSubject(): String {
        return this.subject
    }

    public fun setSubject(subject: String) {
        this.subject = subject
    }

    public fun getTo(): ArrayList<String> {
        return this.to
    }

    public fun setTo(to: String) {
        this.to.add(to)
    }

}