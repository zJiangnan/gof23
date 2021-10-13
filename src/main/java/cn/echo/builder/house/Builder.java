package cn.echo.builder.house;

/**
 * @Package: cn.echo.builder
 * @Author: pluto
 * @CreateTime: 2021/10/13 2:49 下午
 * @Description: 抽象的建造者：方法（图纸）
 **/
public abstract class Builder {

    abstract void buildA(); //地基
    abstract void buildB(); //钢筋工程
    abstract void buildC(); //铺电线
    abstract void buildD(); //粉刷

    abstract Product getProduct();  //完工：得到产品

}
