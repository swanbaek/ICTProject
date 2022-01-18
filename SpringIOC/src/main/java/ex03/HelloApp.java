package ex03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloApp {

	public static void main(String[] args) {
		//DL: Dependency Lookup
		//Spring Container: ApplicationContext
		String config="src/main/java/ex03/applicationContext.xml";
		
		ApplicationContext ctx=new FileSystemXmlApplicationContext(config);
		//스프링 컨테이너
		
		//필요한 객체를 이름으로 찾아서 사용하자. ==> DL
		MessageBean mb=(MessageBean) ctx.getBean("mbEn");
		mb.sayHello("King");

	}

}
