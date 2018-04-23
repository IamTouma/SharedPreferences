package com.example.sharedpreferences

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.R.id.edit
import android.content.Context
import android.content.SharedPreferences.Editor
import android.content.SharedPreferences



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ファイル名:DataStore
        val dataStore = getSharedPreferences("DataStore", Context.MODE_PRIVATE)
        val editor = dataStore.edit()
        // Key: input, value: text
        editor.putString("input", "abcdefg")
        //editor.commit();
        editor.apply()

        val dataString = dataStore.getString("ianput", "hoge")
    }
}
