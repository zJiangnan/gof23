package cn.echo.factory.abstractfy;

/**
 * @Package: cn.echo.factory.abstractfy
 * @Author: pluto
 * @CreateTime: 2021/10/10 2:12 下午
 * @Description: 华为工厂
 **/
public class HuaWeiFactory implements IProductFactory {
    @Override
    public IPhoneProduct iphoneProduct() {
        return new HuaWeiIphone();
    }

    @Override
    public IRouterProduct irouterProduct() {
        return new HuaWeiRouter();
    }
}
