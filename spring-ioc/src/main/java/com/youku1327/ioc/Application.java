package com.youku1327.ioc;

import com.youku1327.ioc.service.IocService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author lsc
 * @Description <p> 初始ioc</p>
 * @Date 2019/10/29 22:22
 */
public class Application {

    public static void main(String[] args) {
        // 创建和配置 beans
        ApplicationContext context =
                new ClassPathXmlApplicationContext(new String[] {"services.xml", "dao.xml"});
        // 获得配置的实例
        IocService service = context.getBean("iocService", IocService.class);
        // 使用配置的实例
        service.setName("youku1327");
        System.out.println(service.getName());
    }
}
