package myproj.service;

import java.util.List;

import myproj.entity.User;

public interface UserService {
	public List<User> getAllUsers();
	public User getUserById(int userId);
	public User addOrUpdateUser(User user);
	public User deleteUser(int userId);
	public List<User> filterUserBySalary(float salary);
}
