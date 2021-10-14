package cn.echo.singleton;

import java.lang.reflect.Constructor;

/**
 * @Package: cn.echo.singleton
 * @Author: pluto
 * @CreateTime: 2021/10/14 10:53 上午
 * @Description: 破解：懒汉式单例-线程安全
 **/
public class LazyMan2a {

    private LazyMan2a() {
    }

//    添加 volatile 使之实现原子性操作
    private volatile static LazyMan2a lazyMan;

    //    双重检测锁模式  懒汉式单例  DCL懒汉式
    public static LazyMan2a getInstance() {
//        解决办法：加锁
        if (lazyMan == null) {
            synchronized (LazyMan2a.class) {
                if (lazyMan == null) {
                    lazyMan = new LazyMan2a();
                }
            }
        }
        return lazyMan;
    }

    public static void main(String[] args) throws Exception {
        LazyMan2a la1 = LazyMan2a.getInstance();
        Constructor<LazyMan2a> declaredConstructor = LazyMan2a.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);    //暴力反射
        LazyMan2a lazyMan2a = declaredConstructor.newInstance();
        System.out.println(la1);
        System.out.println(lazyMan2a);
    }
}
