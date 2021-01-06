import com.buaa.backkom.cloud.OrderMain80;
import com.buaa.backkom.cloud.controller.OrderController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: backkom
 * @Date: 2020/9/12 16:41
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = OrderMain80.class)
public class test
{
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private RestTemplate restTemplate2;
    
    @Test
    public void Autowired_singleton(){
        if(restTemplate==restTemplate2) {
            System.out.println("ok");
        }
        else System.out.println("bad");
    }
}
