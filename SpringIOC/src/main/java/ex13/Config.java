package ex13;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	//Emp빈을 반환하는 메소드 - emp1
	@Bean(name="emp1")
	public Emp getEmp() {
		return new Emp("영업부","김사원",5500);
	}
	
	@Bean(name="emp2")
	public Emp getEmp2() {
		return new Emp("노무부","이사원",6000);
	}
	
	//Member빈을 반환하는 메소드 - member
	@Bean
	public Member member() {
		return new Member();
	}
	
	//ServiceImpl빈을 반환하는 메소드 -service
	@Bean
	public ServiceImpl service() {
		return new ServiceImpl();
	}

}
