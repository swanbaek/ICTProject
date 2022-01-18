package ex07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAppTest {

	public static void main(String[] args) {
		// FileSystemXmlApplicationContext ==> xml������
		// ClassPathXmlApplicationContext ==> xml������
		// AnnotationConfigApplicationContext==> �ڹٷ� ������
		ApplicationContext ctx=new AnnotationConfigApplicationContext(Config.class);
		
		Emp e1=ctx.getBean("e1", Emp.class);
		System.out.println(e1.getName()+"/"+e1.getDept()+"/"+e1.getSalary());
		
		//empInfo2�� ã�Ƽ� �̸�,�μ�,�޿� ����ϱ�
		Emp e2=ctx.getBean("empInfo2", Emp.class);
		System.out.println(e2.getName()+"/"+e2.getDept()+"/"+e2.getSalary());
		
		//ServiceImpl���� ã�Ƽ� test1() ȣ���ϼ���
		
		Service svc = ctx.getBean("service", Service.class);
		
		svc.test1();
		

	}
}
