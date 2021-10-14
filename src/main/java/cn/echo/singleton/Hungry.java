package cn.echo.singleton;

/**
 * @Package: cn.echo.singleton
 * @Author: pluto
 * @CreateTime: 2021/10/14 10:47 上午
 * @Description: 饿汉式单例
 * 程序运行就加载此对象
 **/
public class Hungry {

    /**
     * 出现的问题：浪费空间
     */
    private byte[] data1 = new byte[1024 * 1024];
    private byte[] data2 = new byte[1024 * 1024];
    private byte[] data3 = new byte[1024 * 1024];
    private byte[] data4 = new byte[1024 * 1024];

//    私有化构造器，使此对象不可new
    private Hungry() {

    }

    private final static Hungry HUNGRY = new Hungry();

    public static Hungry getInstance() {
        return HUNGRY;
    }

}
