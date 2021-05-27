package com.unicep.dswdm.prova01.questao02.association

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate

// Unidirectional Association Example
class AssociationExample {
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
    }

    class Book {
        private lateinit var title: String //= "Teste"
        private var authors: ArrayList<String> = arrayListOf()
        // In case of using bidirectional association
//        private var owners: ArrayList<Person> = arrayListOf()

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
        // In case of using bidirectional association
//        public fun addOwners(person: Person) {
//            this.owners.add(person)
//        }
//
//        public fun getOwners(): ArrayList<Person> {
//            return this.owners
//        }
    }
}

fun main(args: Array<String>) {

    // Class Instantiation
    val animalFeroz: AssociationExample.Book = AssociationExample.Book()
    val euSeiMaisOuMenos: AssociationExample.Book = AssociationExample.Book()
    val oAnoQueNaoExistiu: AssociationExample.Book = AssociationExample.Book()
    val leitor1: AssociationExample.Person = AssociationExample.Person()
    val leitor2: AssociationExample.Person = AssociationExample.Person()
    val leitor3: AssociationExample.Person = AssociationExample.Person()

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

    // // In case of using bidirectional association
//    animalFeroz.addOwners(leitor1)
//    euSeiMaisOuMenos.addOwners(leitor1)
//    euSeiMaisOuMenos.addOwners(leitor2)
//    oAnoQueNaoExistiu.addOwners(leitor3)
//    oAnoQueNaoExistiu.addOwners(leitor1)

    leitor1.addOwns(animalFeroz)
    leitor2.addOwns(animalFeroz)
    leitor2.addOwns(euSeiMaisOuMenos)
    leitor2.addOwns(oAnoQueNaoExistiu)
    leitor3.addOwns(euSeiMaisOuMenos)
    leitor3.addOwns(oAnoQueNaoExistiu)

    println("Leitor: ${ leitor1.getName() } tem os seguintes livros:\n\t${ leitor1.getOwns().map { it.getTitle() } }")
    println("Leitor: ${ leitor2.getName() } tem os seguintes livros:\n\t${ leitor2.getOwns().map { it.getTitle() } }")
    println("Leitor: ${ leitor3.getName() } tem os seguintes livros:\n\t${ leitor3.getOwns().map { it.getTitle() } }")


}