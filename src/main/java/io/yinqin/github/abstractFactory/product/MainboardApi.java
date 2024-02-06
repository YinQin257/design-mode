package io.yinqin.github.abstractFactory.product;

/**
 * 主板接口
 *
 * @author YinQin
 * @version 1.0.0
 * @createDate 2024年02月06日
 * @since 1.0.0
 */
public interface MainboardApi {

    /**
     * 获取主板品牌
     * @return 品牌
     */
    public String brand();

    /**
     * 获取主板CPU插槽孔数
     * @return CPU插槽孔数
     */
    public int cpuHoles();
}
