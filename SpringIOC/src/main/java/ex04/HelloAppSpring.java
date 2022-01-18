package ex04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloAppSpring {

	public static void main(String[] args) {
		String config="src/main/java/ex04/appContext.xml";
		//mb1룩업해서 sayHello()호출해보기
		ApplicationContext ac = new FileSystemXmlApplicationContext(config);				
		MessageBean mb = (MessageBean)ac.getBean("mb3");
	
		mb.sayHello();
		mb.sayHi("BTS","블랙핑크");


	}

}
