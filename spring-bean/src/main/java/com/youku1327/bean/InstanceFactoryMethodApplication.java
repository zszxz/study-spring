package com.youku1327.bean;

import com.youku1327.bean.entity.StaticBeanService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author lsc
 * @Description <p> 获得实例使用实例化工厂模式 </p>
 * @Date 2019/10/31 15:12
 */
public class InstanceFactoryMethodApplication {
    public static void main(String[] args) {
        // 创建和配置 bean
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("instance.xml");
        // 获得实例
        StaticBeanService staticBeanService = classPathXmlApplicationContext.getBean("staticBeanService", StaticBeanService.class);
    }
}
