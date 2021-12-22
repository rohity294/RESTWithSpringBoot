package myproj.dao;

import java.util.List;

import myproj.response.UserDepartmentResponse;

public interface UserDao {
	public List<UserDepartmentResponse> getUserDepartment();
}
