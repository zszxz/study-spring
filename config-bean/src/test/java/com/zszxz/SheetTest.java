package com.zszxz;

import com.zszxz.auto.Sheet;
import com.zszxz.auto.SheetConfig;
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
@ContextConfiguration(classes= SheetConfig.class)//加载配置类
public class SheetTest {

    @Autowired
    Sheet sheet;

    @Test
    public void sheetTest(){
        // 生产与中国
        sheet.getQuilt().product();
    }
}
