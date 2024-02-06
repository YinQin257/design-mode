package io.yinqin.github.adapter.adapter;

import io.yinqin.github.adapter.service.Adaptee;
import io.yinqin.github.adapter.service.Target;

/**
 * 接口适配器
 *
 * @author YinQin
 * @version 1.0.0
 * @createDate 2023年11月29日
 * @since 1.0.0
 */
public class Adapter implements Target {

    private final Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
