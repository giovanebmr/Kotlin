package com.example.content_provider_app

import android.database.Cursor

interface NoteClickedListener {

    fun noteClickedItem(cursor:Cursor)

    fun noteRemoveItem(cursor: Cursor?)
}