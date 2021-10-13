package cn.echo.builder.kfc;

/**
 * @Package: cn.echo.builder.kfc
 * @Author: pluto
 * @CreateTime: 2021/10/13 3:39 下午
 * @Description: 测试：客户
 **/
public class Test {

    public static void main(String[] args) {
        Worker worker = new Worker();   //服务员
        Product product = worker    //生产产品
                .buildA("全家桶")  //客户自己选择需要的产品
                .getProduct();  //链式编程
        System.out.println(product.toString());
    }

}
