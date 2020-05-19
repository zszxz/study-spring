import com.zszxz.property.EnvironmentProperty;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * @Author lsc
 * <p> </p>
 */

@RunWith(SpringJUnit4ClassRunner.class)//创建spring应用上下文
@ContextConfiguration(classes= EnvironmentProperty.class)//加载配置类
public class PropertyTest {

//-------------------@PropertySource----------------知识追寻者--------------//

    @Autowired
    EnvironmentProperty environmentProperty;

    @Test
    public void test(){
        // zszxz
        environmentProperty.outputProperty();
    }

//-------------------占位符----------------知识追寻者--------------//
    @Test
    public void testPoint(){
        // share
        environmentProperty.outputPoint();
    }

//-------------------SPEL----------------知识追寻者--------------//


    @Value("#{environmentProperty}")
    private EnvironmentProperty getBean;

    @Test
    public void testBean(){
        // com.zszxz.property.EnvironmentProperty$$EnhancerBySpringCGLIB$$8e54e11f@1d9b7cce
        System.out.println(getBean);
    }

    @Value("#{environmentProperty.getStr()}")
    private String getMethod;

    @Test
    public void testMethod(){
        // 知识追寻者
        System.out.println(getMethod);
    }

    @Value("#{environmentProperty.username}")
    private String getField;

    @Test
    public void testField(){
        // 知识追寻者
        System.out.println(getField);
    }

    @Value("#{T(java.lang.Math).random()}")
    private double number;

    @Test
    public void testStatic() {
        // 0.9205474938572363
        System.out.println(number);
    }

    @Value("#{environmentProperty.username?.toString()}")
    private String notNull;

    @Test
    public void testNotNUll() {
        // 知识追寻者
        System.out.println(notNull);
    }
}
