package cn.echo.factory.method;

/**
 * @Package: cn.echo.factory.method
 * @Author: pluto
 * @CreateTime: 2021/10/10 12:12 下午
 * @Description: 消费者-买车
 **/
public class Consumer {

    public static void main(String[] args) {
        Car wuLing = new WuLingFactory().getCar();
        Car tesla = new TeslaFactory().getCar();

        wuLing.name();
        tesla.name();

        Car moBai = new MoBaiFactory().getCar();

        moBai.name();
    }

}
