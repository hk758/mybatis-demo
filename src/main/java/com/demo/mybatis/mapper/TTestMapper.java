package com.demo.mybatis.mapper;

import com.demo.mybatis.domain.TTest;

public interface TTestMapper {
    TTest selectById(Long id);
}
