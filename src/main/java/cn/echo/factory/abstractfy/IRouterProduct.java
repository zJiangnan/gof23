package cn.echo.factory.abstractfy;

/**
 * @Package: cn.echo.factory.abstractfy
 * @Author: pluto
 * @CreateTime: 2021/10/10 1:56 下午
 * @Description: 路由器产品接口
 **/
public interface IRouterProduct {
    void start();       //开机
    void shutdown();    //关机
    void openWifi();    //打开Wi-Fi
    void setting();     //设置
}
