package impl;

import DAO.engine.QueryEngine;
import service.QueryInterface;

import java.util.Date;

/**
 * Created by luo.m
 */
public class QueryImpl implements QueryInterface {

    //实例化queryEngine
    private QueryEngine queryEngine = QueryEngine.getInstance();

    public Date getDbDate() {
        return queryEngine.getDbDate();
    }
}
