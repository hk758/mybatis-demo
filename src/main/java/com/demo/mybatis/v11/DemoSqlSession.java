package com.demo.mybatis.v11;


public class DemoSqlSession {
    private DemoConfiguration configuration;
    private DemoExecutor executor;

    public DemoSqlSession() {
        if(null == configuration){
            configuration = new DemoConfiguration();
        }
        if(null == executor){
            executor = new DemoExecutor();
        }
    }

    /**
     * 查询操作
     * @param statementId
     * @param parameter
     * @param <T>
     * @return
     */
    public <T> T selectOne(String statementId, Object parameter) {
        String sql = DemoConfiguration.sqlMappings.getString(statementId);
        return executor.query(sql,parameter);
    }

    /**
     * 获取mapper
     * @param clazz
     * @param <T>
     * @return
     */
    public <T> T getMapper(Class clazz){
        return (T)configuration.getMapper(clazz,this);
    }
}
