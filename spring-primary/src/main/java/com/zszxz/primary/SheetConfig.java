package com.zszxz.primary;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @Author lsc
 * <p> </p>
 */
@Configuration
public class SheetConfig {


    @Bean
    public Sheet sheetA(){
        return new SheetA();
    }

    @Bean
    @Primary
    public Sheet sheetB(){
        return new SheetB();
    }

}
