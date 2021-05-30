package com.unicep.dswdm.prova01.questao04.controller

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.unicep.dswdm.prova01.questao04.R
import com.unicep.dswdm.prova01.questao04.model.Book
import kotlinx.android.synthetic.main.layout_book_list_item.view.*
import kotlin.collections.ArrayList

class BookRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val TAG: String = "AppDebug"

    private var items: List<Book> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return BookViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.layout_book_list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {

            is BookViewHolder -> {
                holder.bind(items.get(position))
            }

        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(bookList: List<Book>){
        items = bookList
    }

    class BookViewHolder
    constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){

        val book_title = itemView.book_title
        val book_authors = itemView.book_authors

        fun bind(book: Book){

            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context).applyDefaultRequestOptions(requestOptions)
            book_title.setText("Título: ${ book.getTitle() }") //append(book.getTitle())
            book_authors.setText("Autores: ${ book.getAuthors().toString() }") //append(book.getAuthors().toString())

        }

    }

}
