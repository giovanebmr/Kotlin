package br.com.notificacoes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var botaoSendNotification:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botaoSendNotification = findViewById(R.id.send_notification)

        //Inicia uma Local Notification
        botaoSendNotification.setOnClickListener {
            this.showNotification("1234","Bootcamp Android", "Kotlin Android Curso")
        }
    }
}