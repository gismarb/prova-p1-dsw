package com.unicep.dswdm.prova01.questao03.strategyPatternSolution.strategy.`interface`

import java.time.LocalDate

interface Document : BookInterface, EmailInterface {
    abstract fun getAuthors(): ArrayList<String>
    abstract fun addAuthors(name: String)
    abstract fun getDate(): LocalDate
    abstract fun setDate(date: LocalDate)
}