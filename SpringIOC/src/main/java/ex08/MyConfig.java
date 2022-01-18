package ex08;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import ex08.Emp;
import ex08.ServiceImpl;

@Configuration
public class MyConfig {
	// �������� �⺻������ ���� ������ sigleton(���ϰ�ü)���� �����صΰ� �ִ�.
	@Bean(name = "e1")
	@Scope(value = "prototype")
	// @Scope(value="sigleton")�� default. �� ���� prototype���� �ϸ� �Ź� �ٸ� ��ü�� �����Ѵ�.
	public Emp empInfo() {
		return new Emp("SALES", "James", 4000);
	}

	// Operation, Peter, 4300
	// @Bean�� name�Ӽ��� �������� ������ ���� �̸��� �޼ҵ��̸��� �� name�� �ȴ�.
	@Bean
	public Emp empInfo2() {
		Emp e = this.empInfo();
		e.setDept("Operation");
		e.setName("Peter");
		e.setSalary(4300);
		return e;
	}

	@Bean
	public ServiceImpl service() {
		ServiceImpl svc = new ServiceImpl();
		svc.setEmp(this.empInfo());
		return svc;
	}

	
	
}
