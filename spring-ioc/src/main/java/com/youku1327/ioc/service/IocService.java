package com.youku1327.ioc.service;

import com.youku1327.ioc.dao.IocDao;

/**
 * @Author lsc
 * @Description <p> </p>
 * @Date 2019/10/29 20:03
 */
public class IocService {

    private IocDao iocDao;

    private String name;


    public IocDao getIocDao() {
        return iocDao;
    }

    public void setIocDao(IocDao iocDao) {
        this.iocDao = iocDao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
