package com.example.fragmentpractice

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_my_view_pager.*

class MainActivity : BaseActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setValues()
        setupEvents()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

    }

}
