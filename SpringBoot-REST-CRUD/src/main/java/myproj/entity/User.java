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
	@Column(name="user_id")
	private int userId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="age")
	private int age;
	
	@Column(name="salary")
	private float salary;
	
	@Column(name="department_id")
	private int departmentId;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int userId, String name, int age, float salary, int departmentId) {
		super();
		this.userId = userId;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.departmentId = departmentId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", age=" + age + ", salary=" + salary + ", departmentId="
				+ departmentId + "]";
	}
	
	

}
