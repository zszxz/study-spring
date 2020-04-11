package com.zszxz.bean.config;

import com.zszxz.bean.Sheet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author lsc
 * <p> sheet配置类等同于sheet.xml</p>
 */
@Configuration
public class SeetConfig {

    // 往配置类中注入Bean
    @Bean
    public Sheet sheet(){
        // 创建对象
        Sheet sheet = new Sheet();
        // 设置属性
        sheet.setColor("pink");
        return sheet;
    }
}
