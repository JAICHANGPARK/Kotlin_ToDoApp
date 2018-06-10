package com.dreamwalker.mytestapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.dreamwalker.activitywriter.Database.DBHelper
import kotlinx.android.synthetic.main.activity_read_db.*

class ReadDBActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_read_db)

        val helper = DBHelper(this)
        val db = helper.writableDatabase
        val cursor = db.rawQuery("SELECT title, content FROM TB_MEMO ORDER BY _ID DESC LIMIT 1", null)

        while (cursor.moveToNext()){
            readTitleView.text = cursor.getString(0)
            readContentView.text = cursor.getString(1)

        }
    }
}
