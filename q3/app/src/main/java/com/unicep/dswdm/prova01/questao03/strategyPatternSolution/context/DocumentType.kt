package com.unicep.dswdm.prova01.questao03.strategyPatternSolution.context

import android.os.Build
import androidx.annotation.RequiresApi
import com.unicep.dswdm.prova01.questao03.strategyPatternSolution.strategy.`interface`.Document
import com.unicep.dswdm.prova01.questao03.strategyPatternSolution.strategy.concrete.Book
import com.unicep.dswdm.prova01.questao03.strategyPatternSolution.strategy.concrete.Email
import java.time.LocalDate



public class DocumentType() {
    @RequiresApi(Build.VERSION_CODES.O)
    public fun processDocumentType(option: String) {
        if (option.equals("0")){
            val documentOne: Document = Book()
            val documentTwo: Document = Book()
            printBooks(documentOne, documentTwo)
        }
        else if (option.equals("1")) {
            val documentOne: Document = Email()
            val documentTwo: Document = Email()
            printEmails(documentOne, documentTwo)
        }
        else
            printAnyOtherOptions()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun printBooks(documentOne: Document, documentTwo: Document) {
        documentOne.addAuthors("Lindomar João")
        documentOne.addAuthors("Ralph Rodrigues")
        documentOne.setDate(LocalDate.of(2001, 12, 29))
        documentOne.setTitle("Um livro que ainda não foi escrito por ninguém!!!")

        documentTwo.addAuthors("Gregórios de Alencar")
        documentTwo.addAuthors("Jailton Dantas Rocha")
        documentTwo.addAuthors("Igor D'Ester")
        documentTwo.setDate(LocalDate.of(1992, 3, 15))
        documentTwo.setTitle("Aquele dia, Aquela hora, sempre, sempre")

        val books: ArrayList<Document> = arrayListOf()
        books.add(documentOne)
        books.add(documentTwo)

        println("Listagem de Livros:")
        for (document in books) {
            println("\tTítulo: ${ document.getTitle() }")
            println("\tAutor(es): ${ document.getAuthors() }")
            println("\tData: ${ document.getDate() }")
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun printEmails(documentOne: Document, documentTwo: Document) {
        documentOne.addAuthors("user@ismail.com")
        documentOne.setTo("group@ismail.com")
        documentOne.setTo("support@ismail.com")
        documentOne.setTo("enrico@ismail.com")
        documentOne.setTo("hr@ismail.com")
        documentOne.setDate(LocalDate.of(2021,5,25))
        documentOne.setSubject("[Urgente] Falha em Produção: Necessário intervenção para resolver o problema")

        documentTwo.addAuthors("support@ismail.com")
        documentTwo.setTo("group@ismail.com")
        documentTwo.setTo("isla@ismail.com")
        documentTwo.setTo("user@ismail.com")
        documentTwo.setTo("hr@ismail.com")
        documentTwo.setDate(LocalDate.of(2021,5,28))
        documentTwo.setSubject("[Atualização] Atualização do Software de RH: Necessário parada por 12 horas.")

        val emails: ArrayList<Document> = arrayListOf()
        emails.add(documentOne)
        emails.add(documentTwo)

        println("Listagem de E-mails:")
        for (email in emails) {
            println("\tDe: ${ email.getAuthors() }")
            println("\tPara: ${ email.getTo() }")
            println("\tData: ${ email.getDate() }")
            println("\tAssunto: ${ email.getSubject() }")
        }
    }

    private fun printAnyOtherOptions() {
        println("Opção Não válida!!!")
    }

}