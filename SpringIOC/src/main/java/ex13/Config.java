package ex13;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	//Emp���� ��ȯ�ϴ� �޼ҵ� - emp1
	@Bean(name="emp1")
	public Emp getEmp() {
		return new Emp("������","����",5500);
	}
	
	@Bean(name="emp2")
	public Emp getEmp2() {
		return new Emp("�빫��","�̻��",6000);
	}
	
	//Member���� ��ȯ�ϴ� �޼ҵ� - member
	@Bean
	public Member member() {
		return new Member();
	}
	
	//ServiceImpl���� ��ȯ�ϴ� �޼ҵ� -service
	@Bean
	public ServiceImpl service() {
		return new ServiceImpl();
	}

}
