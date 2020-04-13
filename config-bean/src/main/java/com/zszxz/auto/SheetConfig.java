package com.zszxz.auto;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author lsc
 * <p>被单配置类 </p>
 */
@Configuration//告诉spring这是一个配置类
@ComponentScan//这边的包是com.zszxz.auto 相当于@ComponentScan(basePackages = {"com.zszxz.auto"})
public class SheetConfig {
}
