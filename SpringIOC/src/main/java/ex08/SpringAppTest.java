package ex08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAppTest {

	public static void main(String[] args) {
		// xml설정파일
		String config="ex08/appContext.xml";
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext(config);
		
		Service svc=ctx.getBean("svc", Service.class);
		svc.test1();

	}

}
