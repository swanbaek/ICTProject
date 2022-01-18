package ex11;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
public class AppConfig {
	//properties������ adminIdŰ�� value���� �ش��ϴ� ���� ���Եȴ�.
	@Value("${adminId}")
	private String adminId;
	
	@Value("${adminPwd}")
	private String adminPwd;
	
	//�ܺ�����(properties)�� ������ ���������� �Ʒ� �޼ҵ带 ��������
	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer conf=new PropertySourcesPlaceholderConfigurer();
		
		Resource resource[]=new Resource[1];
		resource[0]=new ClassPathResource("admin.properties");
		conf.setLocations(resource);
		return conf;
	}
	
	
	
	@Bean(name="admin")
	public AdminInfo adminInfomation() {
		AdminInfo ai=new AdminInfo();
		ai.setAdminId(adminId);
		ai.setAdminPwd(adminPwd);
		//ai.setAdminId("sys");
		//ai.setAdminPwd("manager");
		return ai;
	}
	

}
