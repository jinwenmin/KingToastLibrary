package com.wuji.kingmgglibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.wuji.mgglibrary.utils.ToastUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.toast).setOnClickListener { ToastUtils.toast(this, "哈哈哈哈哈") }
    }
}