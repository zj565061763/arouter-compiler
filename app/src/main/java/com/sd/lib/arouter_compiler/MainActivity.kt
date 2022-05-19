package com.sd.lib.arouter_compiler

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.launcher.ARouter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ARouter.openLog()
        ARouter.openDebug()
        ARouter.init(application)

        findViewById<View>(R.id.btn_one).setOnClickListener {
            ARouter.getInstance().build("/activity/one").navigation()
        }

        findViewById<View>(R.id.btn_two).setOnClickListener {
            ARouter.getInstance().build("/activity/two").navigation()
        }
    }
}