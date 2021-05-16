package com.demo.mybatis.v11;

import com.demo.mybatis.domain.TTest;
import com.demo.mybatis.mapper.TTestMapper;
import org.junit.Test;

public class TestQueryV11 {
    @Test
    public void testQuery(){
        DemoSqlSession sqlSession = new DemoSqlSession();
        TTestMapper testMapper = sqlSession.getMapper(TTestMapper.class);
        TTest tTest = testMapper.selectById(2L);
        System.out.println("test===="+tTest);
    }
}
