package com.sd.demo.module_two.service

import com.alibaba.android.arouter.facade.template.IProvider

interface TwoService : IProvider {
    fun sayHello()
}