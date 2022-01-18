package ex13;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//어노테이션을 이용해서 프로퍼티값들을 주입해보자.
//@Value: 기본자료형이나 String값을 주입할 경우
//참조형
//@Autowired: byType으로 주입한다. 타입 > 이름 > @Qualifier
//@Resource : byName으로 주입한다.
//@Inject ==> pom.xml에 라이브러리 등록해야 사용 가능  타입> @Qualifier> 이름
public class ServiceImpl implements Service {
	
	@Autowired
	@Qualifier("emp2")
	private Emp emp;
	//@Autowired
	//자료유형이 Emp인 빈객체가 있으면 해당 빈을 찾아 주입해준다.
	//동일한 자료유형의 객체가 여러 개 있을 경우 예외가 발생
	//구별하기 위해 @Qualifier("빈이름")을 함께 사용하기도 함
	
	
	//@Resource(name="member")//빈의 이름으로 주입함
	@Inject  //by Type으로 주입한다.
	private Member user;

	@Override
	public void test1() {
		System.out.println("Name: "+emp.getName());
		System.out.println("Dept: "+emp.getDept());
		System.out.println("Salary: "+emp.getSalary());
	}

	@Override
	public void test2() {
		System.out.println(user.memberOutput());
	}

}
