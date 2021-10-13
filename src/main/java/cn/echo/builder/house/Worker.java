package cn.echo.builder.house;

/**
 * @Package: cn.echo.builder
 * @Author: pluto
 * @CreateTime: 2021/10/13 2:54 下午
 * @Description: 具体建造者（工人）
 **/
public class Worker extends Builder {

    private Product product;

    public Worker() {
        product = new Product();
    }

    @Override
    void buildA() {
        product.setBuildA("地基");
        System.out.println("建造地基");
    }

    @Override
    void buildB() {
        product.setBuildB("钢筋工程");
        System.out.println("建造钢筋工程");
    }

    @Override
    void buildC() {
        product.setBuildC("铺电线");
        System.out.println("建造铺电线");
    }

    @Override
    void buildD() {
        product.setBuildD("粉刷");
        System.out.println("建造粉刷");
    }

    @Override
    Product getProduct() {
        return product;
    }
}
