import com.shaw.mydaily.entity.Animal;
import com.shaw.mydaily.entity.Cat;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Cat cat = (Cat) classPathXmlApplicationContext.getBean("cat");
        cat.eat();
    }
}
