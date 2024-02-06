package io.yinqin.github.singleton.lazy;

/**
 * 饿汉式单例模式实现
 *
 * @author YinQin
 * @version 1.0.0
 * @createDate 2023年11月29日
 * @since 1.0.0
 */
public class LazySingleton {

    /**
     * 定义一个变量来存储创建好的实例，用它来缓存实例，不用重复创建
     */
    private static LazySingleton instance = null;


    /**
     * 私有化构造方法
     */
    private LazySingleton() {}

    /**
     * 全局唯一的访问点
     * 使用synchronized来保证该方法的线程安全
     * @return  单例对象
     */
    public static synchronized LazySingleton getInstance() {
        // 判断存储实例的变量是否有值
        if (instance == null) {
            // 如果没有则创建，并且赋值给缓存变量
            instance = new LazySingleton();
        }
        return instance;
    }
}
