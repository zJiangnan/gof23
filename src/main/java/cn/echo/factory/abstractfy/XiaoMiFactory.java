package cn.echo.factory.abstractfy;

/**
 * @Package: cn.echo.factory.abstractfy
 * @Author: pluto
 * @CreateTime: 2021/10/10 2:10 下午
 * @Description: 小米工厂
 **/
public class XiaoMiFactory implements IProductFactory {
    @Override
    public IPhoneProduct iphoneProduct() {
        return new XiaoMiIphone();
    }

    @Override
    public IRouterProduct irouterProduct() {
        return new XiaoMiRouter();
    }
}
