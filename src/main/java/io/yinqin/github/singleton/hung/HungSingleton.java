package io.yinqin.github.singleton.hung;

/**
 * 饿汉式单例模式实现
 *
 * @author YinQin
 * @version 1.0.0
 * @createDate 2023年11月29日
 * @since 1.0.0
 */
public class HungSingleton {

    private static final HungSingleton instance = new HungSingleton();


    /**
     * 私有化构造方法
     */
    private HungSingleton() {}

    /**
     * 全局唯一的访问点，直接返回已经初始化好的实例
     * @return  单例对象
     */
    public static HungSingleton getInstance() {
        return instance;
    }
}
