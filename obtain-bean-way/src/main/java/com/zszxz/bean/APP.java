package com.zszxz.bean;

import com.zszxz.bean.config.SeetConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @Author lsc
 * <p> </p>
 */
public class APP {

/*    public static void main(String[] args) {
        // xml路径
        String path = "C:\\java\\workspaceforresource\\study-spring\\obtain-bean-way\\src\\main\\resources\\sheet.xml";
        // 从文件系统中获取上下文
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext(path);
        // 获取bean
        Sheet sheet = (Sheet) applicationContext.getBean("sheet");
        // pink
        System.out.println(sheet.getColor());
    }*/

/*    public static void main(String[] args) {
        // 获取上下文
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("sheet.xml");
        // 获得实例
        Sheet sheet = (Sheet) applicationContext.getBean("sheet");
        // pink
        System.out.println(sheet.getColor());
    }*/

/*    public static void main(String[] args) {
        // 获取上下文
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SeetConfig.class);
        // 获得实例
        Sheet sheet = (Sheet) applicationContext.getBean("sheet");
        // pink
        System.out.println(sheet.getColor());
    }*/

}
