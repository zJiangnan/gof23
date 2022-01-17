package cn.echo.proxy.staticproxy;

/**
 * 代理类-代理类
 * <p></p>
 *
 * @author pluto
 * @version 1.0
 * @createdate 2022/1/14 4:09 PM
 * @see MovieStaticProxy
 **/
public class MovieStaticProxy implements Movie {
    Movie movie;

    public MovieStaticProxy(Movie movie) {
        this.movie = movie;
    }

    @Override
    public void play() {
        playStart();    //代理之前做什么
        movie.play();
        playEnd();    //代理之后做什么
    }

    public void playStart() {
        System.out.println("电影开始前正在播放广告");
    }

    public void playEnd() {
        System.out.println("电影结束了，接续播放广告");
    }
}
