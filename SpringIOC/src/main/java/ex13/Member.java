package ex13;

import org.springframework.beans.factory.annotation.Value;

public class Member {
	
	@Value("��ȸ��")
	private String userName;
	
	@Value("choi")
	private String userId;
	
	@Value("010-1111-2222")
	private String tel;
	
	public Member() {
		
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String memberOutput(){
		String str;
		str = "�̸� = "+userName;
		str += "\n���̵� = "+userId;
		str += "\n����ó = "+tel;
		return str;
	}
	

}
