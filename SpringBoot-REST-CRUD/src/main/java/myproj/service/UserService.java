package myproj.service;

import java.util.List;

import myproj.entity.User;
import myproj.response.UserDepartmentResponse;

public interface UserService {
	public List<User> getAllUsers();
	public User getUserById(int userId);
	public User addOrUpdateUser(User user);
	public User deleteUser(int userId);
	
	//using @Query native query
	public List<User> filterUserBySalary(float salary);
	
	//using Dao,DaoSupport,NamedParameterJdbcDaoSupport,JdbcTemplate,BeanPropertyRowMapper
	public List<UserDepartmentResponse> getUserDepartments();
}
