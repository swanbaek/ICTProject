package ex10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAppTest {

	public static void main(String[] args) {
		// [4] MessageBeanImpl��ü ����ؼ� sayHello(), sayHi()ȣ���ϱ�
		
		ApplicationContext ctx
		=new ClassPathXmlApplicationContext("ex10/appContext.xml");
		
		MessageBean mb=ctx.getBean("mb", MessageBean.class);
		mb.sayHello();
		mb.sayHi("����","����","ö��","�̾�");
	}

}
