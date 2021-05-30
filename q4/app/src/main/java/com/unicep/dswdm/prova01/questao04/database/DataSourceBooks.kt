package com.unicep.dswdm.prova01.questao04.database

import com.unicep.dswdm.prova01.questao04.model.Book

class DataSourceBooks {
    companion object {
        fun createDataSet(): ArrayList<Book> {
            val books: ArrayList<Book> = arrayListOf()

            val bookOne: Book = Book()
            val bookTwo: Book = Book()
            val bookThree: Book = Book()
            val bookFour: Book = Book()
            val bookFive: Book = Book()
            val bookSix: Book = Book()
            val bookSeven: Book = Book()
            val bookEight: Book = Book()
            val bookNine: Book = Book()
            val bookTen: Book = Book()

            bookOne.setTitle("Contos de Fada IV")
            bookOne.addAuthor("Forrest Gun")

            bookTwo.setTitle("As pericpécias do Homem")
            bookTwo.addAuthor("Affonso Pinha")
            bookTwo.addAuthor("Laus Flankkin")
            bookTwo.addAuthor("Huns Junior")


            bookThree.setTitle("Super Velocidade")
            bookThree.addAuthor("Lira Junuior")
            bookThree.addAuthor("Jill Kails")

            bookFour.setTitle("Sempre, Sempre, Sempre")
            bookFour.addAuthor("Desconhecido")

            bookFive.setTitle("Aconteceu em 1943")
            bookFive.addAuthor("Roberto Nauss")
            bookFive.addAuthor("Hilton Nogueira")
            bookFive.addAuthor("Lilian Wite")

            bookSix.setTitle("A história dos 1000 anos")
            bookSix.addAuthor("Jill Kails")
            bookSix.addAuthor("Laguna Peña")
            bookSix.addAuthor("Nortinote Folks")

            bookSeven.setTitle("A prova de de que fogo é fogo")
            bookSeven.addAuthor("Edson Costa")
            bookSeven.addAuthor("Noriberto Jull")
            bookSeven.addAuthor("Alice Werggmm")

            bookEight.setTitle("Tecnologia do Futuro - Fundamentos de Cobol")
            bookEight.addAuthor("Roberta Fisher")
            bookEight.addAuthor("Leonardo Richelle")
            bookEight.addAuthor("Exxer Throwber")

            bookNine.setTitle("Carros super lentos")
            bookNine.addAuthor("Roberto Nauss")
            bookNine.addAuthor("Hilton Nogueira")
            bookNine.addAuthor("Lilian Wite")

            bookTen.setTitle("2020/2021 - Foi tenso!")
            bookTen.addAuthor("Roberto Nauss")

            books.add(bookOne)
            books.add(bookTwo)
            books.add(bookThree)
            books.add(bookFour)
            books.add(bookFive)
            books.add(bookSix)
            books.add(bookSeven)
            books.add(bookEight)
            books.add(bookNine)
            books.add(bookTen)

            return books
        }
    }
}