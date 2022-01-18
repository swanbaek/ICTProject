package ex09;

public class ServiceImpl implements Service {
	
	//property
	private Emp emp;

	@Override
	public void test1() {
		System.out.println("Name: "+emp.getName());
		System.out.println("Dept: "+emp.getDept());
		System.out.println("Salary: "+emp.getSalary());
	}

	public void setEmp(Emp empInfo2) {
		this.emp = empInfo2;
	}
}
