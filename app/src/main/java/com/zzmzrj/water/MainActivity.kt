package com.zzmzrj.water

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // bottom_navigation.setOnNavigationItemSelectedListener {
        //     when(it.itemId){
        //         R.id.device-> {
        //             Toast.makeText(this, "this is a word", Toast.LENGTH_SHORT).show()
        //         }
        //     }
        // }

    }
    
}


