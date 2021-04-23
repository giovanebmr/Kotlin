package br.com.notificacoes

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseMessagingService : FirebaseMessagingService() {

    val TAG = "FireMessagingServices" //FirebaseMessagingServices

    override fun onMessageReceived(remoteMessaging: RemoteMessage) {
        Log.i(TAG, remoteMessaging.from.toString())

        if( remoteMessaging.notification != null){
            this.showNotification("1234",
                remoteMessaging.notification?.title.toString(),
                remoteMessaging.notification?.body.toString())
        }
    }
}