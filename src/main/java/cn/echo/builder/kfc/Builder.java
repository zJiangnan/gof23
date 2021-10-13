package cn.echo.builder.kfc;

/**
 * @Package: cn.echo.builder.kfc
 * @Author: pluto
 * @CreateTime: 2021/10/13 3:30 下午
 * @Description: 建造者：套餐
 **/
public abstract class Builder {

//    默认套餐
    abstract Builder buildA(String msg);  //汉堡
    abstract Builder buildB(String msg);  //可乐
    abstract Builder buildC(String msg);  //薯条
    abstract Builder buildD(String msg);  //甜点

    abstract Product getProduct();

}
