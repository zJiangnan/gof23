package cn.echo.factory.simple;

/**
 * @Package: cn.echo.factory.simple
 * @Author: pluto
 * @CreateTime: 2021/10/10 10:42 上午
 * @Description: 汽车工厂
 * 使用简单工厂模式(也称静态工厂模式)
 * 缺点：如果新增一个汽车就得修改该工厂的代码
 **/
public class CarFactory {

//    方法一：不符合开闭原则（不易修改）
    public static Car getCar(String car){
        if(car.equals("五菱")) {
            return new WuLing();
        } else if (car.equals("特斯拉")) {
            return new Tesla();
        } else {
            return null;
        }
    }

//    方法二：不易维护
    public static Car getWuLing() {
        return new WuLing();
    }

    public static Car getTeslage() {
        return new Tesla();
    }

}
