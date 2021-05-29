package com.unicep.dswdm.prova01.questao03.simpleSolutionOne.model

class BookModel : DocumentModel() {
    private var title: String = ""

    public fun getTitle(): String {
        return this.title
    }

    public fun setTitle(title: String){
        this.title = title
    }
}