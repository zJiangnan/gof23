package cn.echo.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 自定义方法拦截器
 * <p></p>
 *
 * @author pluto
 * @version 1.0
 * @createdate 2022/1/17 9:29 AM
 * @see CglibProxyInterceptor
 **/
public class CglibProxyInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        playStart();
        Object object = methodProxy.invokeSuper(o, objects);
        playEnd();
        return object;
    }
    public void playStart() {
        System.out.println("电影开始前正在播放广告");
    }

    public void playEnd() {
        System.out.println("电影结束了，接续播放广告");
    }
}
