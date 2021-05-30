package com.unicep.dswdm.prova01.questao04.model

class Book : Document() {
    private var title: String = ""

    public fun getTitle(): String {
        return this.title
    }

    public fun setTitle(title: String) {
        this.title = title
    }
}