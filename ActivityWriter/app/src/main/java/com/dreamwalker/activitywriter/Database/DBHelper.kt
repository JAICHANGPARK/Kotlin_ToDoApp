package com.dreamwalker.activitywriter.Database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import java.lang.StringBuilder

class DBHelper(context: Context) : SQLiteOpenHelper(context, "memodb", null, 1) {

    override fun onCreate(db: SQLiteDatabase?) {
        val sb = StringBuilder()
        sb.append("CREATE TABLE IF NOT EXISTS TB_MEMO ")
        sb.append("(_ID INTEGER PRIMARY KEY AUTOINCREMENT ,")
        sb.append("TITLE TEXT,")
        sb.append("CONTENT TEXT)")

        db?.execSQL(sb.toString())

    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

        db?.execSQL("DROP TABLE TB_MEMO")
        onCreate(db)

    }

}