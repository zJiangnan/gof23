package cn.echo.builder.house;

/**
 * @Package: cn.echo.builder
 * @Author: pluto
 * @CreateTime: 2021/10/13 3:00 下午
 * @Description: 测试
 **/
public class Test {

    public static void main(String[] args) {
//        指挥
        Director director = new Director();
//        指挥 具体的工人完成 产品
        Product build = director.build(new Worker());
        System.out.println(build.toString());
    }

}
