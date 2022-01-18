package ex10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAppTest {

	public static void main(String[] args) {
		// [4] MessageBeanImpl°´Ã¼ ·è¾÷ÇØ¼­ sayHello(), sayHi()È£ÃâÇÏ±â
		
		ApplicationContext ctx
		=new ClassPathXmlApplicationContext("ex10/appContext.xml");
		
		MessageBean mb=ctx.getBean("mb", MessageBean.class);
		mb.sayHello();
		mb.sayHi("¿µÈñ","¼øÈñ","Ã¶¼ö","¹Ì¾Ö");
	}

}
