package ex07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAppTest {

	public static void main(String[] args) {
		// FileSystemXmlApplicationContext ==> xml설정시
		// ClassPathXmlApplicationContext ==> xml설정시
		// AnnotationConfigApplicationContext==> 자바로 설정시
		ApplicationContext ctx=new AnnotationConfigApplicationContext(Config.class);
		
		Emp e1=ctx.getBean("e1", Emp.class);
		System.out.println(e1.getName()+"/"+e1.getDept()+"/"+e1.getSalary());
		
		//empInfo2를 찾아서 이름,부서,급여 출력하기
		Emp e2=ctx.getBean("empInfo2", Emp.class);
		System.out.println(e2.getName()+"/"+e2.getDept()+"/"+e2.getSalary());
		
		//ServiceImpl빈을 찾아서 test1() 호출하세요
		
		Service svc = ctx.getBean("service", Service.class);
		
		svc.test1();
		

	}
}
