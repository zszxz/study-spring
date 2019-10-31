package com.youku1327.bean.entity;

/**
 * @Author lsc
 * @Description <p> </p>
 * @Date 2019/10/31 13:55
 */
public class StaticBeanService {

    private static StaticBeanService staticBeanService = new StaticBeanService();

    // other properties

    private StaticBeanService() {}

    public static StaticBeanService createInstance() {
        // add your properties
        return staticBeanService;
    }

}
