package cn.echo.factory.abstractfy;

/**
 * @Package: cn.echo.factory.abstractfy
 * @Author: pluto
 * @CreateTime: 2021/10/10 2:03 下午
 * @Description: 小米路由器
 **/
public class XiaoMiRouter implements IRouterProduct {
    @Override
    public void start() {
        System.out.println("打开小米路由器");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭小米路由器");
    }

    @Override
    public void openWifi() {
        System.out.println("打开小米路由器Wi-Fi");
    }

    @Override
    public void setting() {
        System.out.println("打开小米路由器设置");
    }
}
