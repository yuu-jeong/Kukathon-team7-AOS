package com.kusitms.team7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val search_btn = findViewById<ImageButton>(R.id.search_btn)
        //val btn_notice = findViewById<ImageButton>(R.id.btn_notice)
        val most_search_4 = findViewById<ImageButton>(R.id.most_search_4)
        val btn_enroll = findViewById<ImageButton>(R.id.btn_enroll)
        val btn_myPage = findViewById<ImageButton>(R.id.btn_myPage)
        val btn_notice = findViewById<ImageButton>(R.id.btn_notice)

        search_btn.setOnClickListener {
            val intent = Intent(this,Search::class.java)
            startActivity(intent)
            finish()
        }


        most_search_4.setOnClickListener {
            val intent = Intent(this, Search_bread::class.java)
            startActivity(intent)
            finish()
        }

        btn_enroll.setOnClickListener {
            val intent = Intent(this,enrollActivity::class.java)
            startActivity(intent)
            finish()
        }

        btn_myPage.setOnClickListener {
            val intent = Intent(this,MyFridgeActivity::class.java)
            startActivity(intent)
            finish()
        }

        btn_notice.setOnClickListener {
            val intent = Intent(this,NoticeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}