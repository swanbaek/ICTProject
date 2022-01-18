package ex11;

public class AdminInfo {
	
	private String adminId;
	private String adminPwd;
	
	public void showInfo() {
		System.out.println("adminId: "+adminId);
		System.out.println("adminPwd: "+adminPwd);
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getAdminPwd() {
		return adminPwd;
	}

	public void setAdminPwd(String adminPwd) {
		this.adminPwd = adminPwd;
	}
    		

}
