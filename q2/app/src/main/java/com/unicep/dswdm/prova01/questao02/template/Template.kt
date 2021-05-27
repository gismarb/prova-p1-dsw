package com.unicep.dswdm.prova01.questao02.template

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate

class Template {
    class Person{
        private lateinit var name: String
        @RequiresApi(Build.VERSION_CODES.O)
        private var birthDate = LocalDate.of(1997,12,26) // Mock birthday date

        public fun getName(): String {
            return this.name
        }

        public fun setName(name: String) {
            this.name = name
        }

        @RequiresApi(Build.VERSION_CODES.O)
        public fun isBirthday(): Boolean {
            val today = LocalDate.now().toString().substring(8)
            return this.birthDate.toString().substring(8) == today
        }

    }

    class Book{
        private lateinit var title: String //= "Teste"
        private var authors: ArrayList<String> = arrayListOf()

        public fun getTitle(): String {
            return this.title
        }

        // this method was not required, but I am writing it down here
        public  fun setTitle(title: String) {
            this.title = title
        }

        public fun getAuthors(): ArrayList<String> {
            return this.authors
        }

        public fun addAuthor(name: String) {
            this.authors.add(name)
        }

    }
}

@RequiresApi(Build.VERSION_CODES.O)
fun main(args: Array<String>) {
    val pessoa : Template.Person = Template.Person()
    val book: Template.Book = Template.Book()
//    if (pessoa.isBirthday()) println("Birthday") else println("Not is Birthday")
//    if (pessoa.isBirthday()) Log.d("_isBirthday", "Birthday") else Log.d("_isBirthday", "Not is Birthday")
    pessoa.setName("Ricardo Suares")
    println(pessoa.getName())
    println(pessoa.isBirthday())

    book.setTitle("Uma lua de Cristal")
    book.addAuthor("Liminha Careca")
    book.addAuthor("Robson Richard")
    book.addAuthor("Laurenciano")
    println(book.getTitle())
    println(book.getAuthors())


}