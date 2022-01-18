package ex11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAppTest {

	public static void main(String[] args) {
		// admin���� lookup�ؼ� showInfo()�޼ҵ带 ȣ���ϼ���
		ApplicationContext ctx
			=new AnnotationConfigApplicationContext(AppConfig.class);
		
		AdminInfo admin=ctx.getBean("admin", AdminInfo.class);
		admin.showInfo();
		

	}

}
