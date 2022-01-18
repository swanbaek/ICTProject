package ex13;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//������̼��� �̿��ؼ� ������Ƽ������ �����غ���.
//@Value: �⺻�ڷ����̳� String���� ������ ���
//������
//@Autowired: byType���� �����Ѵ�. Ÿ�� > �̸� > @Qualifier
//@Resource : byName���� �����Ѵ�.
//@Inject ==> pom.xml�� ���̺귯�� ����ؾ� ��� ����  Ÿ��> @Qualifier> �̸�
public class ServiceImpl implements Service {
	
	@Autowired
	@Qualifier("emp2")
	private Emp emp;
	//@Autowired
	//�ڷ������� Emp�� ��ü�� ������ �ش� ���� ã�� �������ش�.
	//������ �ڷ������� ��ü�� ���� �� ���� ��� ���ܰ� �߻�
	//�����ϱ� ���� @Qualifier("���̸�")�� �Բ� ����ϱ⵵ ��
	
	
	//@Resource(name="member")//���� �̸����� ������
	@Inject  //by Type���� �����Ѵ�.
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
