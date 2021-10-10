package cn.echo.factory.abstractfy;

/**
 * @Package: cn.echo.factory.abstractfy
 * @Author: pluto
 * @CreateTime: 2021/10/10 1:54 下午
 * @Description: 手机产品接口
 **/
public interface IPhoneProduct {
    void start();       //开机
    void shutdown();    //关机
    void callup();      //打电话
    void sendSMS();     //发短信
}
