package com.zszxz.profile;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
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
@ContextConfiguration(classes= DataSourceConfig.class)//加载配置类
@ActiveProfiles("dev")
public class ProfileTest {

    @Autowired
    private DataSource dataSource;

    @Test
    public void sheetTest(){
        JdbcTemplate jdbc = new JdbcTemplate(dataSource);
        List<String> query = jdbc.query("select * from customer", new RowMapper<String>() {
            @Override
            public String mapRow(ResultSet rs, int rowNum) throws SQLException {
                return rs.getLong("id") + ":" + rs.getString("customer_name");
            }
        });
        // [19:知识追寻者, 20:知识追寻者, 21:知识追寻者, 22:知识追寻者, 23:知识追寻者]
        System.out.println(query);
    }
}
