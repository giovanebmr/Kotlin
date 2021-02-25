package br.com.contatos_app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    private val rvList: RecyclerView by lazy { rv_list }

    private val adapter = ContactAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bindViews()
        upDateList()
    }

    private fun bindViews() {
        rvList.adapter = adapter
        rvList.layoutManager = LinearLayoutManager(this)
    }

    private fun upDateList(){
        val list = arrayListOf(
            Contact("Giovane","(63)8433-9473","img.png"),
            Contact("Giovane","(63)8433-9473","img.png"),
            Contact("Giovane","(63)8433-9473","img.png"),
            Contact("Giovane","(63)8433-9473","img.png"),
            Contact("Giovane","(63)8433-9473","img.png"),
            Contact("Giovane","(63)8433-9473","img.png"),
            Contact("Giovane","(63)8433-9473","img.png"),
            Contact("Giovane","(63)8433-9473","img.png"),
            Contact("Giovane","(63)8433-9473","img.png"),
            Contact("Giovane","(63)8433-9473","img.png"),
            Contact("Giovane","(63)8433-9473","img.png"),
            Contact("Giovane","(63)8433-9473","img.png"),
            Contact("Giovane","(63)8433-9473","img.png"),
            Contact("Giovane","(63)8433-9473","img.png"),
            Contact("Giovane","(63)8433-9473","img.png"),
            Contact("Giovane","(63)8433-9473","img.png"),
            Contact("Giovane","(63)8433-9473","img.png")
        )
        adapter.upDateList(list)
    }
}