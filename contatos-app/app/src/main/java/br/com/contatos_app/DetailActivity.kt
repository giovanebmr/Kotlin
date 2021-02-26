package br.com.contatos_app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.contact_detail.*
import kotlinx.android.synthetic.main.contact_detail.toolbar

class DetailActivity : AppCompatActivity() {

    private var contact:Contact? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.contact_detail)

        initToolbar()
        getExtras()
        bindViews()
    }

    private fun initToolbar() {
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }

    private fun bindViews() {
        tv_name.text = contact?.name
        tv_phone.text = contact?.phone
    }


    private fun getExtras(){
        contact = intent.getParcelableExtra(EXTRA_CONTACT)
    }

    companion object{
        const val EXTRA_CONTACT:String = "EXTRA_CONTACT"
    }



}