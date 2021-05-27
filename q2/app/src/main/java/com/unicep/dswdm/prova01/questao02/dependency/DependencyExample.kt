package com.unicep.dswdm.prova01.questao02.dependency

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate

class DependencyExample {
    class Person {
        private lateinit var name: String
        @RequiresApi(Build.VERSION_CODES.O)
        private var birthDate = LocalDate.of(1997, 12, 26) // Mock birthday date

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

        public fun hasRead(book: Book): Boolean {
            val readBooks: ArrayList<String> = arrayListOf()

            // Mocking Data
            readBooks.add("E a noite nevou")
            readBooks.add("Animal Feiroz")
            readBooks.add("Animal Singela")
            readBooks.add("Eu sei mais ou menos")
            readBooks.add("Eu nem sei que Livro é este")
            readBooks.add("Eu sei menos ou mais")

            return readBooks.contains(book.getTitle())
        }
    }

    class Book {
        private lateinit var title: String //= "Teste"
        private var authors: ArrayList<String> = arrayListOf()

        public fun getTitle(): String {
            return this.title
        }

        // This method was not required, but I am writing it down here
        public fun setTitle(title: String) {
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

fun main(args: Array<String>) {

    // Class Instantiation
    val animalFeroz: DependencyExample.Book = DependencyExample.Book()
    val euSeiMaisOuMenos: DependencyExample.Book = DependencyExample.Book()
    val oAnoQueNaoExistiu: DependencyExample.Book = DependencyExample.Book()
    val leitor: DependencyExample.Person = DependencyExample.Person()

    // Mocking Data
    animalFeroz.setTitle("Animal Feiroz")
    animalFeroz.addAuthor("Junio Beirantes")
    animalFeroz.addAuthor("Ana Carol")
    euSeiMaisOuMenos.setTitle("Eu sei mais ou menos")
    euSeiMaisOuMenos.addAuthor("Rosi Regis")
    euSeiMaisOuMenos.addAuthor("Noriundo Sennis")
    euSeiMaisOuMenos.addAuthor("Nelios Brandão")
    oAnoQueNaoExistiu.setTitle("O ano que não existiu")
    oAnoQueNaoExistiu.addAuthor("Gilrio Niusterr")
    leitor.setName("Gilson Nunes de Assis")

    println("Obras disponíveis:")
    println("Livro: ${ animalFeroz.getTitle() } \n\tAutores: ${ animalFeroz.getAuthors() }")
    println("Livro: ${ euSeiMaisOuMenos.getTitle() } \n\tAutores: ${ euSeiMaisOuMenos.getAuthors() }")
    println("Livro: ${ oAnoQueNaoExistiu.getTitle() } \n\tAutores: ${ oAnoQueNaoExistiu.getAuthors() }")

    println("\n")
    println("O Lietor ${ leitor.getName() } leu ${ animalFeroz.getTitle() } (False/True)? ${ leitor.hasRead(animalFeroz) }")
    println("O Lietor ${ leitor.getName() } leu ${ euSeiMaisOuMenos.getTitle() } (False/True)? ${ leitor.hasRead(euSeiMaisOuMenos) }")
    println("O Lietor ${ leitor.getName() } leu ${ oAnoQueNaoExistiu.getTitle() } (False/True)? ${ leitor.hasRead(oAnoQueNaoExistiu) }")

}