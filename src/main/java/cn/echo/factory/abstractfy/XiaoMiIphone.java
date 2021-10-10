package cn.echo.factory.abstractfy;

/**
 * @Package: cn.echo.factory.abstractfy
 * @Author: pluto
 * @CreateTime: 2021/10/10 1:58 下午
 * @Description: 小米手机
 **/
public class XiaoMiIphone implements IPhoneProduct {
    @Override
    public void start() {
        System.out.println("开启小米手机");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭小米手机");
    }

    @Override
    public void callup() {
        System.out.println("小米手机拨打电话");
    }

    @Override
    public void sendSMS() {
        System.out.println("小米手机发送短信");
    }
}
