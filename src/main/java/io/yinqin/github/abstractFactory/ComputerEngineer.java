package io.yinqin.github.abstractFactory;

import io.yinqin.github.abstractFactory.factory.AbstractFactory;
import io.yinqin.github.abstractFactory.product.CPUApi;
import io.yinqin.github.abstractFactory.product.MainboardApi;

/**
 * 装机工程师类
 *
 * @author YinQin
 * @version 1.0.0
 * @createDate 2024年02月06日
 * @since 1.0.0
 */
public class ComputerEngineer {

    /**
     * 根据装机方案组装电脑
     * @param schema 方案
     */
    public void makeComputer(AbstractFactory schema){
        prepareHardware(schema);
    }

    /**
     * 根据装机方案准备硬件
     * @param schema 装机方案
     */
    private void prepareHardware(AbstractFactory schema){
        CPUApi cpu = schema.createCPUApi();
        System.out.println("当前方案中的CPU品牌是" + cpu.brand() + ",针脚数目是" + cpu.pins());
        MainboardApi mainboard = schema.createMainboardApi();
        System.out.println("当前方案中的主板品牌是" + mainboard.brand() + ",针脚数目是" + mainboard.cpuHoles());
    }

}
