package cn.echo.singleton;

import java.lang.reflect.Constructor;

/**
 * @Package: cn.echo.singleton
 * @Author: pluto
 * @CreateTime: 2021/10/14 1:48 下午
 * @Description: 枚举
 **/
public enum EnumSingle {

    INTERFACE;

    public EnumSingle getInterface() {
        return INTERFACE;
    }
}

class Test{
    public static void main(String[] args) throws Exception {
        EnumSingle instance1 = EnumSingle.INTERFACE;
        EnumSingle instance2 = EnumSingle.INTERFACE;
        System.out.println(instance1);
        System.out.println(instance2);

//        破坏枚举
        /**
         * 第一次破坏报错：Exception in thread "main" java.lang.NoSuchMethodException: cn.echo.singleton.EnumSingle.<init>()
         * 没有空参构造器
         * 通过反编译发现是一个有参构造(String,int)
         * 补齐之后
         * 第二次：报错(理想)：
         * Exception in thread "main" java.lang.IllegalArgumentException: Cannot reflectively create enum objects
         * 证明枚举不能被暴力反射
         */
        Constructor<EnumSingle> declaredConstructor = EnumSingle.class.getDeclaredConstructor(String.class, int.class);
        declaredConstructor.setAccessible(true);
        EnumSingle enumSingle = declaredConstructor.newInstance();
        System.out.println(enumSingle);
    }
}
