package com.dreamwalker.activitywriter

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.net.NetworkInfo
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import io.paperdb.Paper
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() , View.OnClickListener {


    var networkInfo : NetworkInfo? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Paper.init(this)

        val helper = DBHelper(this)
        val dbs = helper.writableDatabase

        val db = openOrCreateDatabase("menodb", Context.MODE_PRIVATE,null)
        db.execSQL("insert into tb_memo(title,content) values(?,?)", arrayOf<String>("hello", "world"))

        button_01.setOnClickListener {
            Toast.makeText(this,"hello", Toast.LENGTH_LONG).show()

        }

        val values = ContentValues()
        values.put("name", "Dreamwalker")
        values.put("phone", "0101010101")



    }

    override fun onClick(v: View?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    class DBHelper(context: Context):SQLiteOpenHelper(context,"memodb", null, 1){
        override fun onCreate(db: SQLiteDatabase?) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

    }

}
