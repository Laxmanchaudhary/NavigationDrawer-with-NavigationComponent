package com.example.navigationdrawerwithnavigationcomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
lateinit var navcontroller:NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
       navcontroller= Navigation.findNavController(this,R.id.fragment)
        NavigationUI.setupWithNavController(navogation_view,navcontroller)
        NavigationUI.setupActionBarWithNavController(this,navcontroller,drawerlayout)



    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navcontroller,drawerlayout)
    }
}
