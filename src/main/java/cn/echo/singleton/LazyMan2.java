package cn.echo.singleton;

/**
 * @Package: cn.echo.singleton
 * @Author: pluto
 * @CreateTime: 2021/10/14 10:53 上午
 * @Description: 懒汉式单例-线程安全
 **/
public class LazyMan2 {

    private LazyMan2() {
        System.out.println(Thread.currentThread().getName() + "ok");
    }

//    添加 volatile 使之实现原子性操作
    private volatile static LazyMan2 lazyMan;

    //    双重检测锁模式  懒汉式单例  DCL懒汉式
    public static LazyMan2 getInstance() {
//        解决办法：加锁
        if (lazyMan == null) {
            synchronized (LazyMan2.class) {
                if (lazyMan == null) {
                    /**
                     * 在极端条件下，不是一个原子性操作，因为new对象分为：
                     * 1、分配内存空间
                     * 2、执行构造方法：初始化对象
                     * 3、把这个对象指向这个空间        重排现象
                     *
                     * 会出现：
                     * 线程A执行123
                     * 线程B执行132
                     * 执行线程B会出现第一个if的 lazyman 不等于null，返回这个null的 lazyman
                     * 避免这种问题出现为 lazyMan 属性加上 volatile(原子性操作)
                     * 这样就不会出现new对象出现重排现象
                     */
                    lazyMan = new LazyMan2();
                }
            }
        }
        return lazyMan;
    }

    //    多线程并发，不安全
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                LazyMan2.getInstance();
            }).start();
        }
    }
}
