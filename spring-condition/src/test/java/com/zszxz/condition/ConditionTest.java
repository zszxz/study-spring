package com.zszxz.condition;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author lsc
 * <p> </p>
 */

@RunWith(SpringJUnit4ClassRunner.class)//创建spring应用上下文
@ContextConfiguration(classes= UserConfig.class)//加载配置类
public class ConditionTest {

    @Autowired
    User user;

    @Test
    public void test(){
        // zszxz
        System.out.println(user.getUserName());
    }
}
