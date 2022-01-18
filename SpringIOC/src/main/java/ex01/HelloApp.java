package ex01;

public class HelloApp {

	public static void main(String[] args) {
		//MessageBeanKo mb=new MessageBeanKo();
		MessageBeanEn mb = new MessageBeanEn();
		mb.sayHello("홍길동");
		/* HelloApp이 MessageBeanKo를 사용(use)한다
		 * ==> HelloApp이 MessageBeanKo에 의존한다 (dependency 관계)
		 *    의존관계가 있을 경우 객체들간의 결합도가 중요하다
		 *    결합도가 강하면 향후 객체를 교체하고자 할 때 문제가 될 수 있다.
		 * */

	}

}
