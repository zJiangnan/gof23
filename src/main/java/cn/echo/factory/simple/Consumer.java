package cn.echo.factory.simple;

/**
 * @Package: cn.echo.factory.simple
 * @Author: pluto
 * @CreateTime: 2021/10/10 10:39 上午
 * @Description: 消费者-买车
 **/
public class Consumer {

    public static void main(String[] args) {
//        1、多态实现
//        Car wuLing = new WuLing();
//        Car tesla = new Tesla();

//        2、工厂创建
        Car tesla = CarFactory.getCar("特斯拉");
        Car wuLing = CarFactory.getCar("五菱");

        wuLing.name();
        tesla.name();
    }

}
