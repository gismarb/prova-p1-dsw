package com.unicep.dswdm.prova01.questao03.simpleSolutionOne

import android.os.Build
import androidx.annotation.RequiresApi
import java.util.*

const val DOCUMENT_TYPE_EMAIL = "1"
const val DOCUMENT_TYPE_BOOK = "0"

@RequiresApi(Build.VERSION_CODES.O)
fun main(args: Array<String>) {
    val scan: Scanner = Scanner(System.`in`)
    var opt: String = "yes"

    println("Solução 1 - Sem utilização de propriedades/atributos e métodos abstratos\n")

    while (opt != "nao") {
        print("Entre com a opção [${DOCUMENT_TYPE_BOOK} para Livros] ou [${DOCUMENT_TYPE_EMAIL} para e-mails]: ")

        val documentType = scan.nextLine().trim().toString()
        if (documentType == DOCUMENT_TYPE_BOOK)
            instantiateAndPrintClassDocumentBook(documentType)
        else if (documentType == DOCUMENT_TYPE_EMAIL)
            instantiateAndPrintClassDocumentEmail(documentType)
        else
            println("$documentType digitado é uma opção não válida!!!")

        print("Digite [ nao ] para encerrar: ")
        opt = scan.nextLine().trim().lowercase()

        println(" ------ ")
    }
}
