package com.unicep.dswdm.prova01.questao03.simpleSolutionTwo.model

import java.time.LocalDate


abstract class DocumentModel {
    internal abstract var  authors: ArrayList<String>
    internal abstract var date: LocalDate

    abstract fun getAuthors(): ArrayList<String>
    abstract fun addAuthors(name: String)
    abstract fun getDate(): LocalDate
    abstract fun setDate(date: LocalDate)
}