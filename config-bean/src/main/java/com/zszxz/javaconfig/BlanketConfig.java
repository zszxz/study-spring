package com.zszxz.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author lsc
 * <p>毛毯配置类 </p>
 */
@Configuration//告诉spring这是一个配置类,spring会扫描其所有配置纳入spring容器
public class BlanketConfig {

    // 将Cotton注入到spring应用上下文
    @Bean
    public Cotton cotton(){
        return new Cotton();
    }

    // 将 Cotton注入到Blanket注入到spring应用上下文
    @Bean
    public Blanket blanket(Cotton cotton){
        return new Blanket(cotton);
    }
}
