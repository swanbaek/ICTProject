package ex01;

public class HelloApp {

	public static void main(String[] args) {
		//MessageBeanKo mb=new MessageBeanKo();
		MessageBeanEn mb = new MessageBeanEn();
		mb.sayHello("ȫ�浿");
		/* HelloApp�� MessageBeanKo�� ���(use)�Ѵ�
		 * ==> HelloApp�� MessageBeanKo�� �����Ѵ� (dependency ����)
		 *    �������谡 ���� ��� ��ü�鰣�� ���յ��� �߿��ϴ�
		 *    ���յ��� ���ϸ� ���� ��ü�� ��ü�ϰ��� �� �� ������ �� �� �ִ�.
		 * */

	}

}
