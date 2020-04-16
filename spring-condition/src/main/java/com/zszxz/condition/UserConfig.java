package com.zszxz.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @Author lsc
 * <p> </p>
 */
@Configuration
public class UserConfig {

    @Bean
    // 根据 RuntimeExist的 matches 方法的返回值 是否装配bean
    @Conditional(RuntimeExist.class)
    public User user(){
        User user = new User();
        user.setUserName("zszxz");
        return user;
    }
}
