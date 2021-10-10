package cn.echo.factory.method;

/**
 * @Package: cn.echo.factory.method
 * @Author: pluto
 * @CreateTime: 2021/10/10 1:04 下午
 * @Description: 单车
 **/
public class MoBai implements Car {
    @Override
    public void name() {
        System.out.println("单车");
    }
}
