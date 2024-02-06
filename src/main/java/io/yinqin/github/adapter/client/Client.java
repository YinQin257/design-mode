package io.yinqin.github.adapter.client;

import io.yinqin.github.adapter.adapter.Adapter;
import io.yinqin.github.adapter.service.Adaptee;
import io.yinqin.github.adapter.service.Target;

/**
 * 使用适配器的客户端
 *
 * @author YinQin
 * @version 1.0.0
 * @createDate 2023年11月29日
 * @since 1.0.0
 */
public class Client {

    public static void main(String[] args) {
        // 创建需要被适配的对象
        Adaptee adaptee = new Adaptee();
        // 通过适配器获取到客户端需要调用的接口对象
        Target target = new Adapter(adaptee);
        // 调用方法
        target.request();
    }
}
