package myproj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myproj.dao.UserDao;
import myproj.entity.User;
import myproj.repo.UserRepo;
import myproj.response.UserDepartmentResponse;
import myproj.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public List<User> getAllUsers() {
		return (List<User>) userRepo.findAll();
	}

	@Override
	public User getUserById(int userId) {
		return userRepo.findById(userId).orElse(null);
	}

	@Override
	public User addOrUpdateUser(User user) {
		return userRepo.save(user);
	}

	@Override
	public User deleteUser(int userId) {
		User toDeleteUser = null;
		try {
			toDeleteUser = userRepo.findById(userId).orElse(null);
			if(toDeleteUser == null) {
				throw new Exception("this user does not exist");
			}
			else
			{
				userRepo.delete(toDeleteUser);
				//or
				//userRepo.deleteById(userId);
			}
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return toDeleteUser;
	}
	
	//using @Query native query
	public List<User> filterUserBySalary(float salary){
		return userRepo.filterUserBySalary(salary);
	}
	
	//using Dao,DaoSupport,NamedParameterJdbcDaoSupport,JdbcTemplate,BeanPropertyRowMapper
	public List<UserDepartmentResponse> getUserDepartments(){
		return userDao.getUserDepartment();
	}

}
