package ex11;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
public class AppConfig {
	//properties파일의 adminId키의 value값에 해당하는 값이 주입된다.
	@Value("${adminId}")
	private String adminId;
	
	@Value("${adminPwd}")
	private String adminPwd;
	
	//외부파일(properties)의 데이터 얻어오기위해 아래 메소드를 구성하자
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
