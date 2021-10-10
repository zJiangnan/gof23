package cn.echo.factory.abstractfy;

/**
 * @Package: cn.echo.factory.abstractfy
 * @Author: pluto
 * @CreateTime: 2021/10/10 2:01 下午
 * @Description: 华为手机
 **/
public class HuaWeiIphone implements IPhoneProduct {
    @Override
    public void start() {
        System.out.println("开启华为手机");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭华为手机");
    }

    @Override
    public void callup() {
        System.out.println("华为手机拨打电话");
    }

    @Override
    public void sendSMS() {
        System.out.println("华为手机发送短信");
    }
}
