package microservice.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import microservice.test.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
