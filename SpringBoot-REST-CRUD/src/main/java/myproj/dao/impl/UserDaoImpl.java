package myproj.dao.impl;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import myproj.dao.UserDao;
import myproj.dao.support.NamedParameterJdbcDaoSupportClass;
import myproj.response.UserDepartmentResponse;

@Repository
public class UserDaoImpl extends NamedParameterJdbcDaoSupportClass implements UserDao{

	@Override
	public List<UserDepartmentResponse> getUserDepartment() {
		List<UserDepartmentResponse> response = null;
		try {
			String query = "select user.name as userName, department.name as departmentName from user inner join department on user.department_id = department.id;";
			response = getNamedParameterJdbcTemplate().getJdbcOperations().query(query, new BeanPropertyRowMapper<UserDepartmentResponse>(UserDepartmentResponse.class));
			System.out.println("********************************");
			System.out.println(response.get(0));
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return response;
	}

}
