package com.zszxz.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author lsc
 * <p> </p>
 */
public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        // 单例测试
        Sheet sheetA = context.getBean(Sheet.class);
        Sheet sheetB = context.getBean(Sheet.class);
        // 原型 多例测试
        Cotton cottonA = context.getBean(Cotton.class);
        Cotton cottonB = context.getBean(Cotton.class);
        // sheetA = sheetB? true
        System.out.println("sheetA = sheetB? " + sheetA.equals(sheetB));
        //  cottonA 与 cottonB 是否相等：false
        System.out.println("cottonA 与 cottonB 是否相等：" + cottonA.equals(cottonB));
        context.close();
    }
}
