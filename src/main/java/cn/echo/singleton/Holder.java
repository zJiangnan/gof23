package cn.echo.singleton;

/**
 * @Package: cn.echo.singleton
 * @Author: pluto
 * @CreateTime: 2021/10/14 11:10 上午
 * @Description: 单例模式-静态内部类实现
 **/
public class Holder {

    private Holder() {
    }

    public static Holder getInstance() {
//        调用静态内部类的方式：不安全
        return InnerClass.HOLDER;
    }

    //    静态内部类
    public static class InnerClass {
        private static final Holder HOLDER = new Holder();
    }

}
