package cn.echo.factory.abstractfy;

/**
 * @Package: cn.echo.factory.abstractfy
 * @Author: pluto
 * @CreateTime: 2021/10/10 2:07 下午
 * @Description: 抽象产品工厂
 **/
public interface IProductFactory {
//    生产手机
    IPhoneProduct iphoneProduct();

//    生产路由器
    IRouterProduct irouterProduct();
}
