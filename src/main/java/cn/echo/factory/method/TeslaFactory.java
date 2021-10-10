package cn.echo.factory.method;

/**
 * @Package: cn.echo.factory.method
 * @Author: pluto
 * @CreateTime: 2021/10/10 12:14 下午
 * @Description: 特斯拉工厂
 **/
public  class TeslaFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Tesla();
    }
}
