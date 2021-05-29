package com.unicep.dswdm.prova01.questao03.simpleSolutionOne

import android.os.Build
import androidx.annotation.RequiresApi
import com.unicep.dswdm.prova01.questao03.simpleSolutionOne.model.BookModel
import com.unicep.dswdm.prova01.questao03.simpleSolutionOne.model.EmailModel
import java.time.LocalDate


@RequiresApi(Build.VERSION_CODES.O)
fun instantiateAndPrintClassDocumentBook(documentType: String) {
    // Books
    val bookOne: BookModel = BookModel()
    bookOne.addAuthors("Lindomar João")
    bookOne.addAuthors("Ralph Rodrigues")
    bookOne.setDate(LocalDate.of(2001, 12, 29))
    bookOne.setTitle("Um livro que ainda não foi escrito por ninguém!!!")
//    bookOne.apply { println(this) }
    val bookTwo: BookModel = BookModel()
    bookTwo.addAuthors("Gregórios de Alencar")
    bookTwo.addAuthors("Jailton Dantas Rocha")
    bookTwo.addAuthors("Igor D'Ester")
    bookTwo.setDate(LocalDate.of(1992, 3, 15))
    bookTwo.setTitle("Aquele dia, Aquela hora, sempre, sempre")
//    bookTwo.apply { println(this) }

    val books: ArrayList<BookModel> = arrayListOf()
    books.add(bookOne)
    books.add(bookTwo)

    println("Listagem de Livros:")
    for (book in books) {
        println("\tTítulo: ${ book.getTitle() }")
        println("\tAutor(es): ${ book.getAuthors() }")
        println("\tData: ${ book.getDate() }")
    }
}

@RequiresApi(Build.VERSION_CODES.O)
fun instantiateAndPrintClassDocumentEmail(documentType: String) {
    // E-mails
    val emailOne: EmailModel = EmailModel()
    emailOne.addAuthors("user@ismail.com")
    emailOne.setTo("group@ismail.com")
    emailOne.setTo("support@ismail.com")
    emailOne.setTo("enrico@ismail.com")
    emailOne.setTo("hr@ismail.com")
    emailOne.setDate(LocalDate.of(2021,5,25))
    emailOne.setSubject("[Urgente] Falha em Produção: Necessário intervenção para resolver o problema")
    val emailTwo: EmailModel = EmailModel()
    emailTwo.addAuthors("support@ismail.com")
    emailTwo.setTo("group@ismail.com")
    emailTwo.setTo("isla@ismail.com")
    emailTwo.setTo("user@ismail.com")
    emailTwo.setTo("hr@ismail.com")
    emailTwo.setDate(LocalDate.of(2021,5,28))
    emailTwo.setSubject("[Atualização] Atualização do Software de RH: Necessário parada por 12 horas.")

    val emails: ArrayList<EmailModel> = arrayListOf()
    emails.add(emailOne)
    emails.add(emailTwo)

    println("Listagem de E-mails:")
    for (email in emails) {
        println("\tDe: ${ email.getAuthors() }")
        println("\tPara: ${ email.getTo() }")
        println("\tData: ${ email.getDate() }")
        println("\tAssunto: ${ email.getSubject() }")
    }
}