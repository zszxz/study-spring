package com.zszxz.property;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @Author lsc
 * <p> </p>
 */
@Configuration
@PropertySource(value = {"classpath:zszxz.properties"},encoding = "UTF-8")
@Component
public class EnvironmentProperty {

    // 注入环境
    @Autowired
    private Environment environment;


    public void outputProperty(){
        System.out.println(environment.getProperty("zszxz.name"));
    }

    @Value("${zszxz.point}")
    private String point;

    public String username = "知识追寻者";

    public void outputPoint(){
        System.out.println(point);
    }

    public String getStr(){
        return "知识追寻者";
    }


}
