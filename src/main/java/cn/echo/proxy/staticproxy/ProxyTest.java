package cn.echo.proxy.staticproxy;

/**
 * 测试-静态代理
 * <p></p>
 *
 * @author pluto
 * @version 1.0
 * @createdate 2022/1/14 4:10 PM
 * @see ProxyTest
 **/
public class ProxyTest {
    public static void main(String[] args) {
        Movie captainAmericaMovie = new CaptainAmericaMovie();    //功能的实现也就是目标对象
        Movie movieStaticProxy = new MovieStaticProxy(captainAmericaMovie);    //创建代理对象
        movieStaticProxy.play();    //通过代理对象去执行所需功能并做好(代理实现功能前后做的)
    }
}
