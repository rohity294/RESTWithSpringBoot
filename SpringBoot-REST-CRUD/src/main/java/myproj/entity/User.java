package myproj.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int userId;
	
	@Column(name="name")
	private String userName;
	
	@Column(name="age")
	private int userAge;
	
	@Column(name="salary")
	private float userSalary;
	
	@Column(name="department_id")
	private int userDepartmentId;

	public User() {
		super();
	}

	public User(int userId, String userName, int userAge, float userSalary, int userDepartmentId) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAge = userAge;
		this.userSalary = userSalary;
		this.userDepartmentId = userDepartmentId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public float getUserSalary() {
		return userSalary;
	}

	public void setUserSalary(float userSalary) {
		this.userSalary = userSalary;
	}

	public int getUserDepartmentId() {
		return userDepartmentId;
	}

	public void setUserDepartmentId(int userDepartmentId) {
		this.userDepartmentId = userDepartmentId;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userAge=" + userAge + ", userSalary="
				+ userSalary + ", userDepartmentId=" + userDepartmentId + "]";
	}
	
}
