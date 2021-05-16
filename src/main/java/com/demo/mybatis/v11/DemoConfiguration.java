package com.demo.mybatis.v11;

import java.lang.reflect.Proxy;
import java.util.ResourceBundle;


public class DemoConfiguration {
    // 存储属性文件的信息
    public static final ResourceBundle sqlMappings;

    static {
        sqlMappings = ResourceBundle.getBundle("v11sql");
    }
    /**
     * 获取mapper
     * @param clazz
     * @param <T>
     * @return
     */
    public <T> T getMapper(Class clazz, DemoSqlSession zzhSqlSession){
        //三个参数分别为：类加载器、被代理类的实现接口、触发管理器
        return (T)Proxy.newProxyInstance(this.getClass().getClassLoader(),
                new Class[] {clazz},
                new DemoMapperProxy(zzhSqlSession));
    }
}
