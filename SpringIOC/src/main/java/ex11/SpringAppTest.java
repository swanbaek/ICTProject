package ex11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAppTest {

	public static void main(String[] args) {
		// admin빈을 lookup해서 showInfo()메소드를 호출하세요
		ApplicationContext ctx
			=new AnnotationConfigApplicationContext(AppConfig.class);
		
		AdminInfo admin=ctx.getBean("admin", AdminInfo.class);
		admin.showInfo();
		

	}

}
