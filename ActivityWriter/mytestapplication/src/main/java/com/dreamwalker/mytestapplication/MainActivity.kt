package com.dreamwalker.mytestapplication

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.dreamwalker.activitywriter.Database.DBHelper
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addBtnView.setOnClickListener {

            val title = addTitleView.text.toString()
            val content = addContentView.text.toString()
            val helper = DBHelper(this)
            val db = helper.writableDatabase
            db.execSQL("INSERT INTO TB_MEMO (TITLE, CONTENT) VALUES(?,?)", arrayOf<String>(title, content))
            db.close()
            val intent = Intent(this, ReadDBActivity::class.java)
            startActivity(intent)
        }
    }
}
