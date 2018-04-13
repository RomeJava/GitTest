package DAO.engine;


import DAO.QueryDAO;

import java.util.Date;

/**
 * Created by luo.m
 */
public class QueryEngine  {


    /**
     * 实例
     */
    private static QueryEngine instance;

    /**
     * 查询
     */
    private QueryDAO queryDAO;

    /**
     * 获取单例
     * 不考虑内存分配的问题
     * @return
     */
    public static QueryEngine getInstance() {
        if(null==instance){
            synchronized(QueryEngine.class){
                if(null==instance){
                    instance = new QueryEngine();
                }
            }
        }
        return instance;
    }

    public Date getDbDate() {
        return queryDAO.getDbDate();
    }
}
