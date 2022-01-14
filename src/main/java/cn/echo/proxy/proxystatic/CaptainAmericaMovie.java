package cn.echo.proxy.proxystatic;

/**
 * 静态代理-目标对象的实现类
 * <p></p>
 *
 * @author pluto
 * @version 1.0
 * @createdate 2022/1/14 3:56 PM
 * @see Movie
 **/
public class CaptainAmericaMovie implements Movie {
    @Override
    public void play() {
        System.out.println("普通影厅正在播放的电影是《美国队长》");
    }
}