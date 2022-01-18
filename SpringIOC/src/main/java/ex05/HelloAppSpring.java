package ex05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloAppSpring {

	public static void main(String[] args) {
		String config = "src/main/java/ex05/emp.xml";
		ApplicationContext ctx = new FileSystemXmlApplicationContext(config);
		
		//e2·è¾÷ÇØº¸±â
		Emp e = ctx.getBean("e2", Emp.class);
		e.info1();
		System.out.println("-----------------------------------------------------");
		Emp e3 = ctx.getBean("e3", Emp.class);
		e3.info2();
		System.out.println("-----------------------------------------------------");
		Emp e4= ctx.getBean("e4", Emp.class);
		e4.info3();
		System.out.println("-----------------------------------------------------");
		Emp e5= ctx.getBean("e5", Emp.class);
		e5.info4();
		
	}

}
