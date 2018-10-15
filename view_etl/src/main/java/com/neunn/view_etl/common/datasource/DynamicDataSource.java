package com.neunn.view_etl.common.datasource;
//继承了AbstractRoutingDataSource并重写determineCurrentLookupKey()
// 在该方法中使用DatabaseContextHolder获取当前线程DatabaseType
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DynamicDataSource extends AbstractRoutingDataSource{
    @Override
    protected Object determineCurrentLookupKey() {
        return DatabaseContextHolder.getDatabaseType();
    }
}
