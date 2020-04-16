package com.zszxz.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Author lsc
 * <p> </p>
 */
public class RuntimeExist  implements Condition {
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        // 获取jvm 运行时环境
        Environment environment = conditionContext.getEnvironment();
        // 检查 jvm 运行时环境是否存在属性
        return environment.containsProperty("java.runtime.name");
    }
}
