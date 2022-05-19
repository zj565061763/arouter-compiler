package com.sd.demo.module_two.service

import android.content.Context
import android.util.Log
import com.alibaba.android.arouter.facade.annotation.Route

@Route(path = "/service/two")
class TwoServiceImpl : TwoService {
    override fun sayHello() {
        Log.i(javaClass.name, "say hello")
    }

    override fun init(context: Context) {
    }
}