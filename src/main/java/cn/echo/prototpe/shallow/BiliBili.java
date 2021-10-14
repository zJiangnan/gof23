package cn.echo.prototpe.shallow;

import java.util.Date;

/**
 * @Package: cn.echo.prototpe.video
 * @Author: pluto
 * @CreateTime: 2021/10/13 4:11 下午
 * @Description: 客户端
 **/
public class BiliBili {

    public static void main(String[] args) throws CloneNotSupportedException {
//        原型对象video
        Date date = new Date();
        Video video = new Video("123", date);
        System.out.println("video=>" + video);
        System.out.println("video=>hash：" + video.hashCode());

//        video 克隆 copyvideo
        Video copyvideo = (Video)video.clone();
        System.out.println("copyvideo=>" + copyvideo);
        System.out.println("copyvideo=>hash：" + copyvideo.hashCode());

        /**
         * 这里是浅克隆
         * 复杂对象：video 和 copyvideo 的date的地址还是一样的改变一个另一个也会改变
         */

        copyvideo.setName("copy123");
        System.out.println("copyvideo=>" + copyvideo);
        System.out.println("copyvideo=>hash：" + copyvideo.hashCode());

        System.out.println("---------------------");
        date.setTime(23649234);
        System.out.println("video=>" + video);
        System.out.println("video的时间对象=>hash：" + video.getCreateTim().hashCode());
        System.out.println("copyvideo=>" + copyvideo);
        System.out.println("copyvideo的时间对象=>hash：" + copyvideo.getCreateTim().hashCode());
    }

}
