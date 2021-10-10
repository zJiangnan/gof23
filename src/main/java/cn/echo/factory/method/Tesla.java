package cn.echo.factory.method;

/**
 * @Package: cn.echo.factory.simple
 * @Author: pluto
 * @CreateTime: 2021/10/10 10:38 上午
 * @Description: 特斯拉
 **/
public class Tesla implements Car {
    @Override
    public void name() {
        System.out.println("特斯拉");
    }
}
