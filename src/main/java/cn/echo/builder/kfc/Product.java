package cn.echo.builder.kfc;

/**
 * @Package: cn.echo.builder.kfc
 * @Author: pluto
 * @CreateTime: 2021/10/13 3:32 下午
 * @Description: 具体的套餐，产品
 **/
public class Product {

    private String BuildA = "汉堡";
    private String BuildB = "可乐";
    private String BuildC = "薯条";
    private String BuildD = "甜点";

    public String getBuildA() {
        return BuildA;
    }

    public void setBuildA(String buildA) {
        BuildA = buildA;
    }

    public String getBuildB() {
        return BuildB;
    }

    public void setBuildB(String buildB) {
        BuildB = buildB;
    }

    public String getBuildC() {
        return BuildC;
    }

    public void setBuildC(String buildC) {
        BuildC = buildC;
    }

    public String getBuildD() {
        return BuildD;
    }

    public void setBuildD(String buildD) {
        BuildD = buildD;
    }

    @Override
    public String toString() {
        return "Product{" +
                "BuildA='" + BuildA + '\'' +
                ", BuildB='" + BuildB + '\'' +
                ", BuildC='" + BuildC + '\'' +
                ", BuildD='" + BuildD + '\'' +
                '}';
    }
}
