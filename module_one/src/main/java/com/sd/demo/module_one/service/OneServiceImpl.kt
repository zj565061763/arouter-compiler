package com.sd.demo.module_one.service

import android.content.Context
import android.util.Log
import com.alibaba.android.arouter.facade.annotation.Route

@Route(path = "/service/one")
class OneServiceImpl : OneService {
    override fun sayHello() {
        Log.i(javaClass.name, "say hello")
    }

    override fun init(context: Context) {
    }
}