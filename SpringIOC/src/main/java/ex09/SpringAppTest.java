package ex09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAppTest {

	public static void main(String[] args) {
		ApplicationContext ctx
		=new AnnotationConfigApplicationContext(ex09.Config.class);
		
		Service svc=ctx.getBean("service", Service.class);
		svc.test1();
		
		Emp e3=ctx.getBean("e3", Emp.class);
		System.out.println(e3.getName()+"/"+e3.getDept()+"/"+e3.getSalary());

	}

}
