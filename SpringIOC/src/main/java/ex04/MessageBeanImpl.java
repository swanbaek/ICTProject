package ex04;
import java.util.*;
public class MessageBeanImpl implements MessageBean {
	
	//멤버변수 , property
	private String name;
	private String greeting;
	
	private Date today;
	private Random ran;

	@Override
	public void sayHello() {
		System.out.println(greeting+" "+name);
		System.out.println("오늘 날짜: "+today);
		System.out.println("------------------");		
	}

	@Override
	public void sayHi(String... names) {
		System.out.println(greeting);
		if(names!=null) {
			for(String nm:names) {
				System.out.print(nm+", ");
			}
		}
		int num=ran.nextInt(100)+1;
		System.out.println("행운의 숫자는 "+num);
		System.out.println("----------------");
	}

	//setter, getter--------
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public Date getToday() {
		return today;
	}

	public void setToday(Date today) {
		this.today = today;
	}

	public Random getRan() {
		return ran;
	}

	public void setRan(Random ran) {
		this.ran = ran;
	}

	
}
