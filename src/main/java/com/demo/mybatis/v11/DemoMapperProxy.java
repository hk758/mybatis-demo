package com.demo.mybatis.v11;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


public class DemoMapperProxy implements InvocationHandler {
    private DemoSqlSession sqlSession;

    public DemoMapperProxy(DemoSqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String mapperInterface = method.getDeclaringClass().getName();
        String methodName = method.getName();
        String statementId = mapperInterface+"."+methodName;
        return sqlSession.selectOne(statementId,args[0]);
    }
}
