package cn.echo.singleton;

import java.lang.reflect.Constructor;

/**
 * @Package: cn.echo.singleton
 * @Author: pluto
 * @CreateTime: 2021/10/14 10:53 上午
 * @Description: 破坏2-修复2：懒汉式单例-线程安全
 **/
public class LazyMan2c {

    private static boolean flas = false;

    private LazyMan2c() {
//        第三层锁
//        暴力反射-加锁
        synchronized (LazyMan2c.class) {
            if (flas == false) {
                flas = true;
            } else {
                throw new RuntimeException("不要试图使用反射破坏单例模式");
            }
        }

    }

//    添加 volatile 使之实现原子性操作
    private volatile static LazyMan2c lazyMan;

    //    双重检测锁模式  懒汉式单例  DCL懒汉式
    public static LazyMan2c getInstance() {
//        解决办法：加锁
        if (lazyMan == null) {
            synchronized (LazyMan2c.class) {
                if (lazyMan == null) {
                    lazyMan = new LazyMan2c();
                }
            }
        }
        return lazyMan;
    }

    public static void main(String[] args) throws Exception {
        /**
         * 在加第三层锁之后解决暴力反射的问题
         * 但是如果不通过 LazyMan2b.getInstance() 方式创建对象的话直接通过反射创建时
         * 反射创建两个还是会成功
         */
//        LazyMan2c la1 = LazyMan2c.getInstance();
        Constructor<LazyMan2c> declaredConstructor = LazyMan2c.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);    //暴力反射
        LazyMan2c la1 = declaredConstructor.newInstance();      //直接通过反射创建对象
        LazyMan2c lazyMan2a = declaredConstructor.newInstance();
        System.out.println(la1);
        System.out.println(lazyMan2a);
    }
}
