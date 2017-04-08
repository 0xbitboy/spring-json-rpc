import com.github.liaojiacan.jsonrpc.api.dto.UserDTO;
import com.github.liaojiacan.jsonrpc.api.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by liaojiacan on 2017/4/8.
 */
@DirtiesContext
@ContextConfiguration(locations = "classpath:spring.xml")
public class UserServiceTest extends AbstractJUnit4SpringContextTests {


    @Autowired
    private UserService userService;

    @Test
    public void testService(){

        UserDTO userDTO = userService.getUserByUsername("liaojiacan");
        System.out.println(userDTO.toString());
    }
}
