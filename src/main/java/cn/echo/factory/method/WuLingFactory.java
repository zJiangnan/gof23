package cn.echo.factory.method;

/**
 * @Package: cn.echo.factory.method
 * @Author: pluto
 * @CreateTime: 2021/10/10 12:15 下午
 * @Description: 五菱宏光工厂
 **/
public class WuLingFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new WuLing();
    }

}
