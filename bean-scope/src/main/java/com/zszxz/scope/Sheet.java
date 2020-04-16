package com.zszxz.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Author lsc
 * <p> </p>
 */
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
// 等同于@Scope("singleton")
@Component
public class Sheet {

}
