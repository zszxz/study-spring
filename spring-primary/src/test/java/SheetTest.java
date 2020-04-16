import com.zszxz.primary.Sheet;
import com.zszxz.primary.SheetConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author lsc
 * <p> </p>
 */
@RunWith(SpringJUnit4ClassRunner.class)//创建spring应用上下文
@ContextConfiguration(classes= {SheetConfig.class})//加载配置类
public class SheetTest {

    @Qualifier("sheetA")//限定注入Bean ID
    @Autowired
    Sheet sheet;

    @Test
    public void sheetTest(){
        //
        System.out.println(sheet.getColor());
    }
}
