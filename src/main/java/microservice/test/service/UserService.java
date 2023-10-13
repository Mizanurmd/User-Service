package microservice.test.service;

import java.util.List;



import microservice.test.entity.User;


public interface UserService {

	User saveUser(User user);
	List<User>userList(User user);
	User getUserById(Long id);
	void deleteUser(Long id);
	
}
