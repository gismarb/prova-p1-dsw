package com.unicep.dswdm.prova01.questao03.strategyPatternSolution.strategy.`interface`

interface EmailInterface {
    public fun getSubject(): String
    public fun setSubject(subject: String)
    public fun getTo(): ArrayList<String>
    public fun setTo(to: String)
}