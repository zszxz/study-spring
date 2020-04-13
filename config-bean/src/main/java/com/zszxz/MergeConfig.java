package com.zszxz;

import com.zszxz.auto.SheetConfig;
import com.zszxz.javaconfig.Blanket;
import com.zszxz.javaconfig.BlanketConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author lsc
 * <p> </p>
 */
@Configuration
@Import({SheetConfig.class, BlanketConfig.class})
public class MergeConfig {
}
