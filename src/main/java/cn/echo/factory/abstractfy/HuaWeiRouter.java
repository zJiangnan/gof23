package cn.echo.factory.abstractfy;

/**
 * @Package: cn.echo.factory.abstractfy
 * @Author: pluto
 * @CreateTime: 2021/10/10 2:05 下午
 * @Description: 华为路由器
 **/
public class HuaWeiRouter implements IRouterProduct {
    @Override
    public void start() {
        System.out.println("打开华为路由器");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭华为路由器");
    }

    @Override
    public void openWifi() {
        System.out.println("打开华为路由器Wi-Fi");
    }

    @Override
    public void setting() {
        System.out.println("打开华为路由器设置");
    }
}
