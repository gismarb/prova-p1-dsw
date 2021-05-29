package com.unicep.dswdm.prova01.questao03.strategyPatternSolution.client

import android.os.Build
import androidx.annotation.RequiresApi
import com.unicep.dswdm.prova01.questao03.strategyPatternSolution.context.DocumentType
import com.unicep.dswdm.prova01.questao03.strategyPatternSolution.strategy.`interface`.Document
import java.util.*

const val DOCUMENT_TYPE_EMAIL = "1"
const val DOCUMENT_TYPE_BOOK = "0"

@RequiresApi(Build.VERSION_CODES.O)
fun main(args: Array<String>) {
    val documentType: DocumentType = DocumentType()
    val document: Document
    val scan: Scanner = Scanner(System.`in`)
    var opt: String = "yes"

    println("Solução 3 - Com utilização de Padrão de Projetos Strategy (uma forma de implementação)\n")

    while (opt != "nao") {
        print("Entre com a opção [${ DOCUMENT_TYPE_BOOK } para Livros] ou [${DOCUMENT_TYPE_EMAIL} para e-mails]: ")
        documentType.processDocumentType(scan.nextLine().trim().toString())

        print("Digite [ nao ] para encerrar: ")
        opt = scan.nextLine().trim().lowercase()

        println(" ------ ")
    }
}
