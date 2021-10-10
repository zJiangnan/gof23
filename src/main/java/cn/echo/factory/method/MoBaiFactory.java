package cn.echo.factory.method;

/**
 * @Package: cn.echo.factory.method
 * @Author: pluto
 * @CreateTime: 2021/10/10 1:06 下午
 * @Description: 单车工厂
 **/
public class MoBaiFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new MoBai();
    }
}
