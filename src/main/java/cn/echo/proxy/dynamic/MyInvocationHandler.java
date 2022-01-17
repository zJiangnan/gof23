package cn.echo.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理
 * <p>
 *     继承 {@link InvocationHandler} ，作用是：
 *     当代理对象的原本方法被调用的时候，会绑定执行一个方法，
 *     这个方法就是 {@link InvocationHandler} 里面定义的内容，同时会替代原本方法的结果返回。
 *     {@link InvocationHandler} 接口仅有一个 {@code invoke} 方法
 * </p>
 *
 * @author pluto
 * @version 1.0
 * @createdate 2022/1/14 5:20 PM
 * @see MyInvocationHandler
 **/
public class MyInvocationHandler implements InvocationHandler {

    private final Object object;

    public MyInvocationHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        playStart();
        Object invoke = method.invoke(object, args);
        playEnd();
        return invoke;
    }



    public void playStart() {
        System.out.println("电影开始前正在播放广告");
    }
    public void playEnd() {
        System.out.println("电影结束了，接续播放广告");
    }
}
