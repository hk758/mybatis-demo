package com.demo.mybatis.domain;

import lombok.Data;

import java.util.List;

@Data
public class TTest {
    private Long id;
    private String studentName;
    private String className;
    private List<String> course;
    private String courseStr;
}
