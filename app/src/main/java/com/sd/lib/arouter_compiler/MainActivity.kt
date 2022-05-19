package com.sd.lib.arouter_compiler

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.launcher.ARouter
import com.sd.demo.module_one.service.OneService
import com.sd.demo.module_two.service.TwoService

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ARouter.openLog()
        ARouter.openDebug()
        ARouter.init(application)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.btn_activity_one -> {
                ARouter.getInstance().build("/activity/one").navigation()
            }
            R.id.btn_activity_two -> {
                ARouter.getInstance().build("/activity/two").navigation()
            }
            R.id.btn_service_one -> {
                val service1 = ARouter.getInstance().navigation(OneService::class.java)
                val service2 = ARouter.getInstance().navigation(OneService::class.java)
                require(service1 == service2)
                service1.sayHello()
            }
            R.id.btn_service_two -> {
                val service1 = ARouter.getInstance().navigation(TwoService::class.java)
                val service2 = ARouter.getInstance().navigation(TwoService::class.java)
                require(service1 == service2)
                service1.sayHello()
            }
        }
    }
}