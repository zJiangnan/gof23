package cn.echo.proxy.dynamic;

/**
 * 动态代理-目标对象实现类
 * <p></p>
 *
 * @author pluto
 * @version 1.0
 * @createdate 2022/1/14 5:20 PM
 * @see IronManVIPMovie
 **/
public class IronManVIPMovie implements VIPMovie {
    @Override
    public void vipPlay() {
        System.out.println("VI影厅正在播放的电影是《钢铁侠》");
    }
}
