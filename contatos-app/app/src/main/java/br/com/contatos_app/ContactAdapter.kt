package br.com.contatos_app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.contact_item.view.*


class ContactAdapter(val listener: ClickItemContactListener) :
    RecyclerView.Adapter<ContactAdapter.ContactAdapterViewHolder>() {

    private val list: MutableList<Contact> = mutableListOf()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactAdapterViewHolder {
        //momento de criar a view
        val view = LayoutInflater.from(parent.context).inflate(R.layout.contact_item, parent, false)
        return ContactAdapterViewHolder(view, list, listener)
    }

    override fun onBindViewHolder(holder: ContactAdapterViewHolder, position: Int) {
        //momento de popular a view
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        //informa o tamanho da lista
        return list.size
    }


    class ContactAdapterViewHolder(
        itemView: View,
        var list: List<Contact>,
        var listener: ClickItemContactListener
    ) : RecyclerView.ViewHolder(itemView) {

        init {
            itemView.setOnClickListener {
                listener.clickItemContact(list[adapterPosition])
            }
        }

        fun bind(contact: Contact) {
            itemView.tv_name.text = contact.name
            itemView.tv_phone.text = contact.phone
        }
    }

    fun upDateList(list: List<Contact>) {
        //Atualiza a lista e notifica o adapter para refazer as views
        this.list.clear()
        this.list.addAll(list)
        notifyDataSetChanged()
    }


}




















