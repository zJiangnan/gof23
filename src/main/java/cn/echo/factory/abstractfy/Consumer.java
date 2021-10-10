package cn.echo.factory.abstractfy;

/**
 * @Package: cn.echo.factory.abstractfy
 * @Author: pluto
 * @CreateTime: 2021/10/10 2:13 下午
 * @Description: 消费者
 **/
public class Consumer {
    public static void main(String[] args) {
        System.out.println("===============小米产品===============");
        XiaoMiFactory xiaoMi = new XiaoMiFactory();
        IPhoneProduct xiaomiiphone = xiaoMi.iphoneProduct();
        xiaomiiphone.start();
        xiaomiiphone.shutdown();
        IRouterProduct xiaomirouter = xiaoMi.irouterProduct();
        xiaomirouter.start();
        xiaomirouter.shutdown();


        System.out.println("===============华为产品===============");
        HuaWeiFactory huawei = new HuaWeiFactory();
        IPhoneProduct huaweiiphone = huawei.iphoneProduct();
        huaweiiphone.callup();
        huaweiiphone.sendSMS();
        IRouterProduct huaweirouter = huawei.irouterProduct();
        huaweirouter.openWifi();
        huaweirouter.setting();
    }
}
