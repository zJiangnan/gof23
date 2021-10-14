package cn.echo.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * @Package: cn.echo.singleton
 * @Author: pluto
 * @CreateTime: 2021/10/14 10:53 上午
 * @Description: 破坏3：懒汉式单例-线程安全
 **/
public class LazyMan2d {

    private static boolean flas = false;

    private LazyMan2d() {
//        第三层锁
//        暴力反射-加锁
        synchronized (LazyMan2d.class) {
            if (flas == false) {
                flas = true;
            } else {
                throw new RuntimeException("不要试图使用反射破坏单例模式");
            }
        }

    }

//    添加 volatile 使之实现原子性操作
    private volatile static LazyMan2d lazyMan;

    //    双重检测锁模式  懒汉式单例  DCL懒汉式
    public static LazyMan2d getInstance() {
//        解决办法：加锁
        if (lazyMan == null) {
            synchronized (LazyMan2d.class) {
                if (lazyMan == null) {
                    lazyMan = new LazyMan2d();
                }
            }
        }
        return lazyMan;
    }

    public static void main(String[] args) throws Exception {
//        LazyMan2d la1 = LazyMan2d.getInstance();
        Field flas = LazyMan2d.class.getDeclaredField("flas");
        flas.setAccessible(true);   //暴力反射

        Constructor<LazyMan2d> declaredConstructor = LazyMan2d.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);    //暴力反射
        LazyMan2d la1 = declaredConstructor.newInstance();      //直接通过反射创建对象
        flas.set(la1, false);
        LazyMan2d lazyMan2a = declaredConstructor.newInstance();
        System.out.println(la1);
        System.out.println(lazyMan2a);
    }
}
