import com.alonesink.entity.User;
import com.alonesink.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
* Created by  WangDi  on 2017/9/7 0007
*/
/*
通过bean生成和通过注解生成实例对象
* */


public class TestIoc {

    public static void main(String[] args) {

        String[] locations = {"spring/spring.xml"};

        ApplicationContext ctx = new ClassPathXmlApplicationContext(locations);
        UserService userService = (UserService)ctx.getBean("testService");
        User user = new User();
        user.setUsername("zhangsan");
        System.out.println(user.getUsername());
        System.out.println(userService.doLogin(user));
    }

}
