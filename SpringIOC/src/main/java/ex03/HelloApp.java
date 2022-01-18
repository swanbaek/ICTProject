package ex03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloApp {

	public static void main(String[] args) {
		//DL: Dependency Lookup
		//Spring Container: ApplicationContext
		String config="src/main/java/ex03/applicationContext.xml";
		
		ApplicationContext ctx=new FileSystemXmlApplicationContext(config);
		//������ �����̳�
		
		//�ʿ��� ��ü�� �̸����� ã�Ƽ� �������. ==> DL
		MessageBean mb=(MessageBean) ctx.getBean("mbEn");
		mb.sayHello("King");

	}

}
