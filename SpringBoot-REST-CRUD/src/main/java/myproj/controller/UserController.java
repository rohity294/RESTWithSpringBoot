package myproj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import myproj.entity.User;
import myproj.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("")
	public ResponseEntity<List<User>> getAllUsers(){
		List<User> users = null;
		try {
			users = userService.getAllUsers();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return new ResponseEntity<List<User>>(users,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") int id){
		User user = null;
		try {
			user = userService.getUserById(id);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	
	@PostMapping("/addOrUpdateUser")
	public ResponseEntity<User> addOrUpdateUser(@RequestBody User user) {
		User userAddedOrUpdated = null;
		try {
			userAddedOrUpdated = userService.addOrUpdateUser(user);
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return new ResponseEntity<User>(userAddedOrUpdated,HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public ResponseEntity<User> deleteUser(@PathVariable("id") int id){
		User userDeleted = null;
		try {
			userDeleted = userService.deleteUser(id);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return new ResponseEntity<User>(userDeleted,HttpStatus.OK);
	}
	
	//Using native query
	@GetMapping("/filterUserBySalary/{salary}")
	public ResponseEntity<List<User>> filterUserBySalary(@PathVariable("salary") float salary){
		List<User> users = null;
		try {
			 users =  userService.filterUserBySalary(salary);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return new ResponseEntity<List<User>>(users,HttpStatus.OK);
	}
	
}
