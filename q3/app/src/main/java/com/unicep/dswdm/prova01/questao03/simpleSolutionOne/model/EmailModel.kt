package com.unicep.dswdm.prova01.questao03.simpleSolutionOne.model

class EmailModel : DocumentModel() {
    private var subject: String = ""
    private var to: ArrayList<String> = arrayListOf()

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