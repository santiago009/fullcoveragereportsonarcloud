package com.f.fullcoveragereportsonarcloud

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {


    private var viewmodelExample = ViewmodelExample()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewmodelExample.suma(1,2)

    }



}
