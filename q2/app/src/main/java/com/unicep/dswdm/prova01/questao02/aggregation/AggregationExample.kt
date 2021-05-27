package com.unicep.dswdm.prova01.questao02.aggregation

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate

class AggregationExample {
    class Person {
        private lateinit var name: String
        @RequiresApi(Build.VERSION_CODES.O)
        private var birthDate = LocalDate.of(1997, 12, 26) // Mock birthday date
        private var owns: ArrayList<Book> = arrayListOf()

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

        public fun addOwns(book: Book) {
            this.owns.add(book)
        }

        public fun getOwns(): ArrayList<Book> {
            return this.owns
        }

        public fun printPerson() {
            println(
                "Nome: ${ name } " +
                "Livros: ${ owns.map { it.getTitle() } }"
            )
        }
    }

    class Book {
        private lateinit var title: String
        private var authors: ArrayList<String> = arrayListOf()
        private lateinit var owner: Person

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

        public fun setOwner(person: Person) {
            this.owner = person
        }

        public fun getOwner(): Person {
            return this.owner
        }
    }
}

fun main(args: Array<String>) {

    // Class Instantiation
    val animalFeroz: AggregationExample.Book = AggregationExample.Book()
    val euSeiMaisOuMenos: AggregationExample.Book = AggregationExample.Book()
    val oAnoQueNaoExistiu: AggregationExample.Book = AggregationExample.Book()
    val leitor1: AggregationExample.Person = AggregationExample.Person()
    val leitor2: AggregationExample.Person = AggregationExample.Person()
    val leitor3: AggregationExample.Person = AggregationExample.Person()

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
    leitor1.setName("Gilson Nunes de Assis")
    leitor2.setName("Marilia Nobre")
    leitor3.setName("Roberto Brum")
    leitor1.addOwns(animalFeroz)
    leitor2.addOwns(animalFeroz)
    leitor2.addOwns(euSeiMaisOuMenos)
    leitor2.addOwns(oAnoQueNaoExistiu)
    leitor3.addOwns(euSeiMaisOuMenos)
    leitor3.addOwns(oAnoQueNaoExistiu)
//    animalFeroz.setOwner(leitor1)
//    animalFeroz.setOwner(leitor2)
//    animalFeroz.setOwner(leitor3)

    // List of readers and books
    leitor2.printPerson()
    leitor1.printPerson()
    leitor3.printPerson()


}