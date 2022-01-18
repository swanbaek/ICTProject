package ex05;
import java.util.*;
public class EmpImpl implements Emp {
	
	//property
	private String dept;
	private String name;
	private int sal;
	private Random ran;
	
	public EmpImpl() {
		
	}
	//생성자 오버로드(다중정의)
	public EmpImpl(String dept, String name, int sal) {
		super();
		this.dept = dept;
		this.name = name;
		this.sal = sal;
	}
	
	
	

	public EmpImpl(String dept, String name) {
		super();
		this.dept = dept;
		this.name = name;
	}
	
	public EmpImpl(String name) {
		super();
		this.name = name;
	}
	
	
	public EmpImpl(Random ran) {
		super();
		this.ran = ran;
	}
	@Override
	public void info1() {
		System.out.println("Name: "+name);
	}

	
	@Override
	public void info2() {
		this.info1();
		System.out.println("Dept: "+dept);

	}

	@Override
	public void info3() {
		this.info2();
		System.out.println("Salary: "+sal);
	}

	@Override
	public void info4() {
		System.out.println("Lucy Number: "+ran.nextInt(100));
	}

}
