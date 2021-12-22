package myproj.response;

public class UserDepartmentResponse {
	private String userName;
	private String departmentName;
	
	public UserDepartmentResponse() {
		super();
	}

	public UserDepartmentResponse(String userName, String departmentName) {
		super();
		this.userName = userName;
		this.departmentName = departmentName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "UserDepartmentResponse [userName=" + userName + ", departmentName=" + departmentName + "]";
	}
	
	
    
	

}
