package ex04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloAppSpring {

	public static void main(String[] args) {
		String config="src/main/java/ex04/appContext.xml";
		//mb1����ؼ� sayHello()ȣ���غ���
		ApplicationContext ac = new FileSystemXmlApplicationContext(config);				
		MessageBean mb = (MessageBean)ac.getBean("mb3");
	
		mb.sayHello();
		mb.sayHi("BTS","����ũ");


	}

}
