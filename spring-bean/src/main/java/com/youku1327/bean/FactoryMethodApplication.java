package com.youku1327.bean;

import com.youku1327.bean.entity.Car;
import com.youku1327.bean.entity.StaticBeanService;
import com.youku1327.bean.factory.CarFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author lsc
 * @Description <p> 静态工厂方法获得实例化的bean</p>
 * @Date 2019/10/31 13:51
 */
public class FactoryMethodApplication {

    public static void main(String[] args) {
        // 创建和配置 bean
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("instance.xml");
        // 获得实例
        Car car = classPathXmlApplicationContext.getBean("car", Car.class);
        // Manipulate your instance
    }
}
