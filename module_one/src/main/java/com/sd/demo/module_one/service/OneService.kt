package com.sd.demo.module_one.service

import com.alibaba.android.arouter.facade.template.IProvider

interface OneService : IProvider {
    fun sayHello()
}