package ex13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAppTest {

	public static void main(String[] args) {
		// service���� ã�Ƽ� test1(), test2()ȣ���ϱ�
		ApplicationContext ctx=new AnnotationConfigApplicationContext(Config.class);
		
		Service svc=ctx.getBean("service",Service.class);
		
		svc.test1();
		
		svc.test2();

	}

}
