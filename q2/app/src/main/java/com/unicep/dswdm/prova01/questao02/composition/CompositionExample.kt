package com.unicep.dswdm.prova01.questao02.composition

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate

class CompositionExample {
    class Person {
        private lateinit var name: String
        @RequiresApi(Build.VERSION_CODES.O)
        private var birthDate = LocalDate.of(1997, 12, 26) // Mock birthday date
        private var owns: ArrayList<EBookWithDRM> = arrayListOf()

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

        public fun addOwns(eBookWithDRM: EBookWithDRM) {
            this.owns.add(eBookWithDRM)
        }

        public fun getOwns(): ArrayList<EBookWithDRM> {
            return this.owns
        }

        public fun printPerson() {
            println(
                "Nome: ${ this.getName() } " +
                "Livros: ${ this.getOwns().map { it.getTitle() } }"
            )
        }

        class EBookWithDRM {
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

}

fun main(args: Array<String>) {
    val person1: CompositionExample.Person = CompositionExample.Person()
    val person2: CompositionExample.Person = CompositionExample.Person()
    val book1: CompositionExample.Person.EBookWithDRM = CompositionExample.Person.EBookWithDRM()
    val book2: CompositionExample.Person.EBookWithDRM = CompositionExample.Person.EBookWithDRM()

    person1.setName("Gilson Ribas")
    person2.setName("Emiliano Nassar")
    book1.setOwner(person2)
    book1.setTitle("Missão no fundo do Quintal")
    book1.addAuthor("Autor1")
    book1.addAuthor("Autor2")
    book1.addAuthor("Autor3")

    book2.setOwner(person1)
    book2.setTitle("Where the things happen")
    book2.addAuthor("Autor1")
    book2.addAuthor("Autor2")
    book2.addAuthor("Autor3")

    person1.addOwns(book1)
    person1.addOwns(book2)

    person1.printPerson()
    person2.printPerson()
}