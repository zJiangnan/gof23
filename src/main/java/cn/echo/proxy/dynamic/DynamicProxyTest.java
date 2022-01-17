package cn.echo.proxy.dynamic;

import cn.echo.proxy.staticproxy.CaptainAmericaMovie;
import cn.echo.proxy.staticproxy.Movie;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 动态代理-测试
 * <p></p>
 *
 * @author pluto
 * @version 1.0
 * @createdate 2022/1/14 5:22 PM
 * @see DynamicProxyTest
 **/
public class DynamicProxyTest {
    public static void main(String[] args) {
//        设置生成的代理类
        System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles", "true");
//        目标对象
        IronManVIPMovie ironManVIPMovie = new IronManVIPMovie();
//        通过目标对象创建代理实例(动态代理构建的一部分)
        InvocationHandler invocationHandler = new MyInvocationHandler(ironManVIPMovie);
//        通过代理实例构建代理执行对象
        VIPMovie dynamicProxy = (VIPMovie) Proxy.newProxyInstance(IronManVIPMovie.class.getClassLoader(),
                IronManVIPMovie.class.getInterfaces(), invocationHandler);
        dynamicProxy.vipPlay();
//        查看生成的代理类
        System.out.println("VIP 影厅《钢铁侠》代理类："+dynamicProxy.getClass());

        CaptainAmericaMovie captainAmericaMovie = new CaptainAmericaMovie();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(captainAmericaMovie);
        Movie mo = (Movie) Proxy.newProxyInstance(CaptainAmericaMovie.class.getClassLoader(),
                CaptainAmericaMovie.class.getInterfaces(), myInvocationHandler);
        mo.play();
        System.out.println("普通影厅《美国队长》："+myInvocationHandler.getClass());
    }
}
