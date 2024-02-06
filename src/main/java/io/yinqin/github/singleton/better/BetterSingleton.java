package io.yinqin.github.singleton.better;

/**
 * 更好的单例模式实现
 *
 * @author YinQin
 * @version 1.0.0
 * @createDate 2023年11月29日
 * @since 1.0.0
 */
public class BetterSingleton {

    /**
     * 私有化构造方法
     */
    private BetterSingleton() {}

    /**
     * 静态内部类，只有被调用时才会被装载，从而实现延时加载
     */
    private static class SingletonHolder {
        /**
         * 静态初始化单例对象，由JVM来保证线程安全
         */
        private static final BetterSingleton instance = new BetterSingleton();
    }

    /**
     * 全局唯一的访问点，此方法会初始化内部类SingletonHolder
     * 这样做的好处是既实现了懒加载，又实现了线程安全，还保证了性能
     * @return  单例对象
     */
    public static BetterSingleton getInstance() {
        return SingletonHolder.instance;
    }
}
