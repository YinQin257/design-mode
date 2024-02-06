package io.yinqin.github.adapter.service;

/**
 * 已经存在的接口实现，这个接口需要被适配
 *
 * @author YinQin
 * @version 1.0.0
 * @createDate 2023年11月29日
 * @since 1.0.0
 */
public class Adaptee {
    public void specificRequest() {
        System.out.println("实现了XXX功能");
    }
}
