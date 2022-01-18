package ex07;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**자바코드에서 annotation을 이용한 스프링 설정*/
@Configuration //현재 클래스를 환경설정으로 사용한다는 의미=> Config클래스가 IOC컨테이너임을 명시하는 것
public class Config {
	
	//스프링은 기본적으로 빈의 범위를 sigleton(단일객체)으로 설정해두고 있다.
	@Bean(name="e1")
	@Scope(value="prototype")
	//@Scope(value="sigleton")이 default.  이 값을 prototype으로 하면 매번 다른 객체를 생성한다.
	public Emp empInfo() {
		return new Emp("SALES","James",4000);
	}
	//Operation, Peter, 4300
	//@Bean에 name속성을 지정하지 않으면 빈의 이름은 메소드이름이 빈 name이 된다.
	@Bean
	public Emp empInfo2() {
		Emp e=this.empInfo();
		e.setDept("Operation");
		e.setName("Peter");
		e.setSalary(4300);
		return e;
	}
	
	@Bean
	public ServiceImpl service() {
		ServiceImpl svc=new ServiceImpl();
		svc.setEmp(this.empInfo());
		return svc;
	}

}
