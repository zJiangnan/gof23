package cn.echo.prototpe.shallow;

import java.util.Date;

/**
 * @Package: cn.echo.prototpe.video
 * @Author: pluto
 * @CreateTime: 2021/10/13 4:07 下午
 * @Description: Video视频
 * 实现拷贝
 * 1、实现一个接口 Cloneable
 * 2、重写 Object 的 clone 方法
 **/
public class Video implements Cloneable {

    private String name;
    private Date createTim;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Video() {
    }

    public Video(String name, Date createTim) {
        this.name = name;
        this.createTim = createTim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTim() {
        return createTim;
    }

    public void setCreateTim(Date createTim) {
        this.createTim = createTim;
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", createTim=" + createTim +
                '}';
    }
}
