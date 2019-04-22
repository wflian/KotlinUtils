package com.lwf.kotlin_utils

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lwf.utils.DisplayUtils.getScreenHeightDp
import com.lwf.utils.DisplayUtils.getScreenHeightPx
import com.lwf.utils.DisplayUtils.getScreenWidthDp
import com.lwf.utils.DisplayUtils.getScreenWidthPx
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        text1.text = getScreenWidthPx().toString()
        text2.text = getScreenHeightPx().toString()
        text3.text = getScreenWidthDp().toString()
        text4.text = getScreenHeightDp().toString()


    }
}
