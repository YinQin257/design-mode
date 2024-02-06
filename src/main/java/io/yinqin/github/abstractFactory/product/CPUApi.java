package io.yinqin.github.abstractFactory.product;

/**
 * CPU接口
 *
 * @author YinQin
 * @version 1.0.0
 * @createDate 2024年02月06日
 * @since 1.0.0
 */
public interface CPUApi {

    /**
     * 获取品牌
     * @return 品牌
     */
    public String brand();

    /**
     * 获取针脚数
     * @return 针脚数
     */
    public int pins();
}
