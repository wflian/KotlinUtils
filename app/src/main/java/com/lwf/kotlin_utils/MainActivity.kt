package com.lwf.kotlin_utils

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lwf.utils.getDiskCachePath
import com.lwf.utils.getRootPath
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        text1.text = getDiskCachePath()
        text2.text = getRootPath().absolutePath

    }
}


