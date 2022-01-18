package ex12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAppTest {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("ex12/appContext.xml");
		
		AdminInfo admin =ctx.getBean("admin2", AdminInfo.class);
		admin.showInfo();
	}

}
