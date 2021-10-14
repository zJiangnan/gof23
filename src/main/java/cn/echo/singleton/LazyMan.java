package cn.echo.singleton;

/**
 * @Package: cn.echo.singleton
 * @Author: pluto
 * @CreateTime: 2021/10/14 10:53 上午
 * @Description: 懒汉式单例-线程不安全
 **/
public class LazyMan {

    private LazyMan() {
        System.out.println(Thread.currentThread().getName() + "ok");
    }

    private static LazyMan lazyMan;

    public static LazyMan getInstance() {
        if (lazyMan == null) {
            lazyMan = new LazyMan();
        }
        return lazyMan;
    }

    //    多线程并发，不安全
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
//            new Thread(LazyMan::getInstance).start();     //也可以写成这样
            new Thread(() -> {
                LazyMan.getInstance();
            }).start();
        }
    }
}
