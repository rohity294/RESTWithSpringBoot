package myproj.repo;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import myproj.entity.User;

@Repository
public interface UserRepo extends CrudRepository<User, Integer> {
	
	@Query(value="select * from user where salary>= :salaryPassed",nativeQuery=true)
	public List<User> filterUserBySalary(@Param("salaryPassed") float salary);
}
