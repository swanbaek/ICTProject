package ex08;

import javax.annotation.Resource;

public class ServiceImpl implements Service {
	
	//property
	private Emp emp;

	@Override
	public void test1() {
		System.out.println("Name: "+emp.getName());
		System.out.println("Dept: "+emp.getDept());
		System.out.println("Salary: "+emp.getSalary());
	}

	@Resource(name="e3")
	public void setEmp(Emp empInfo2) {
		this.emp = empInfo2;
	}
}
