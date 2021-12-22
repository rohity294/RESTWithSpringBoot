package myproj.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import myproj.entity.User;

@Repository
public interface UserRepo extends CrudRepository<User, Integer> {

}
