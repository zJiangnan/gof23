package cn.echo.builder.house;

/**
 * @Package: cn.echo.builder
 * @Author: pluto
 * @CreateTime: 2021/10/13 2:58 下午
 * @Description: 指挥：核心，负责构建一个工程，工程如何构建，由它决定
 **/
public class Director {

//    指挥工人按照顺序建造方法
    public Product build(Builder builder) {
//        构建过程
        builder.buildA();
        builder.buildB();
        builder.buildC();
        builder.buildD();

        return builder.getProduct();
    }

}
