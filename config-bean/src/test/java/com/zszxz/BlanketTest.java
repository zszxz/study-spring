package com.zszxz;

import com.zszxz.auto.Sheet;
import com.zszxz.auto.SheetConfig;
import com.zszxz.javaconfig.Blanket;
import com.zszxz.javaconfig.BlanketConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author lsc
 * <p> </p>
 */
@RunWith(SpringJUnit4ClassRunner.class)//创建spring应用上下文
@ContextConfiguration(classes= BlanketConfig.class)//加载配置类
public class BlanketTest {

    @Autowired
    Blanket blanket;

    @Test
    public void sheetTest(){
        // cotton生产与中国
        blanket.getCotton().product();
    }
}
