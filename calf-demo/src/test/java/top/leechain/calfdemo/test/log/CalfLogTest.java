package top.leechain.calfdemo.test.log;

import lombok.extern.log4j.Log4j2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author bangquan.qian
 * @Date 2018/11/5 5:56 PM
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:META-INF/spring/applicationContext-*.xml")
@Log4j2
public class CalfLogTest {

    @Test
    public void test() {
        log.error("error {}:{}", "123", "abc");
    }
}
