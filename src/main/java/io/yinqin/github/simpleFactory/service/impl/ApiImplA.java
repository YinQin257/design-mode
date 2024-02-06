package io.yinqin.github.simpleFactory.service.impl;

import io.yinqin.github.simpleFactory.service.Api;

/**
 * 接口api的实现类A
 *
 * @author YinQin
 * @version 1.0.0
 * @createDate 2023年11月28日
 * @since 1.0.0
 */
public class ApiImplA implements Api {
    @Override
    public void operation(String s) {
        System.out.println("ApiImplA:" + s);
    }
}
