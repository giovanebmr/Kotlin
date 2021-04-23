package br.com.notificacoes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.google.firebase.iid.FirebaseInstanceId

//Foi utilizado o Firebase da conta GRPALMAS

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

        Log.i("**newToken", FirebaseInstanceId.getInstance().token.toString())

    }
}