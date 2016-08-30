import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ifnoelse.spring.perform.Perform;

public class SingerTest {

	@Test
	public void test() {
		@SuppressWarnings("resource")
		ApplicationContext appContext = new ClassPathXmlApplicationContext("bean.xml");
		Perform perform = appContext.getBean("perform", Perform.class);
		perform.performing();
	}

}
