package microservice.test.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import microservice.test.entity.User;
import microservice.test.exception.ResourseNotFoundException;
import microservice.test.repository.UserRepository;
import microservice.test.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepo;
	

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	@Override
	public List<User> userList(User user) {
		List<User>u = userRepo.findAll();
		return u;
	}

	@Override
	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		return userRepo.findById(id).orElseThrow(()->new ResourseNotFoundException("User with given id is not found on serve!!!"+ id));
	}

	@Override
	public void deleteUser(Long id) {
		this.userRepo.deleteById(id);
		
	}

}
