package br.com.contatos_app

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.edit
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.contatos_app.DetailActivity.Companion.EXTRA_CONTACT
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.drawer_menu.*
import java.util.ArrayList

class MainActivity : AppCompatActivity(), ClickItemContactListener {

    private val rvList: RecyclerView by lazy { rv_list }

    private val adapter = ContactAdapter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.drawer_menu)
        initDrawer()
        fetchListContact()
        bindViews()
    }

    private fun fetchListContact() {
        //colocar uma chamada à api aqui
        val list = arrayListOf(
            Contact("Giovane Reis","(63)8433-9473","img.png"),
            Contact("José da Silva","(63)8433-9473","img.png"),
            Contact("Maria José","(63)8433-9473","img.png"),
            Contact("Ana Claudia","(63)8433-9473","img.png"),
            Contact("Carlos Santos","(63)8433-9473","img.png"),
            Contact("Antônio Ribeiro","(63)8433-9473","img.png"),
            Contact("Pedro Alves","(63)8433-9473","img.png"),
            Contact("Tatiane Rezende","(63)8433-9473","img.png"),
            Contact("Pedro Queiroz","(63)8433-9473","img.png"),
            Contact("Arthur Santos","(63)8433-9473","img.png"),
            Contact("Pedro Ribeiro","(63)8433-9473","img.png"),
            Contact("Carlos Salvador","(63)8433-9473","img.png"),
            Contact("Junior Ribeiro","(63)8433-9473","img.png")
        )
        //Salvar no SQLite aqui
        getInstanceSharedPreferences().edit {
            putString( "contacts", Gson().toJson(list) )
            commit()//sincrono neste caso para gatantir que foi gravado antes de realizar a consulta
            //apply()assincrono, verificar usos da forma assincrona
        }

    }

    private fun getInstanceSharedPreferences(): SharedPreferences{
        return getSharedPreferences("br.com.contatos_app.PREFERENCES", Context.MODE_PRIVATE)
    }

    private fun initDrawer() {
       // val drawerLayout = findViewById<View>(R.id.drawer_layout) as DrawerLayout
       // val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        val toggle = ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_drawer, R.string.close_drawer)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
    }


    private fun bindViews() {
        rvList.adapter = adapter
        rvList.layoutManager = LinearLayoutManager(this)
        upDateList()
    }

    //converter uma string para um objeto de classe
    private fun getListContacts():List<Contact>{
        val list = getInstanceSharedPreferences().getString("contacts","[]")
        val turnsType = object : TypeToken<List<Contact>>() {}.type
        return Gson().fromJson(list,turnsType)
    }

    private fun upDateList(){
        adapter.upDateList(
            getListContacts()
        )
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.item_menu_1 -> {
                showToast("Exibindo item de menu 1")
                true
            }
            R.id.item_menu_2 -> {
                showToast("Exibindo item de menu 2")
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun showToast(message:String){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun clickItemContact(contact: Contact) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra(EXTRA_CONTACT, contact)
        startActivity(intent)
    }


}