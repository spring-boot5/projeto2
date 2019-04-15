package procon.io.projeto2.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import procon.io.projeto2.entity.User;

public interface UserRepository extends MongoRepository<User, String> {

//	@Query("SELECT u FROM User u WHERE u.name like %?1%")
//	User findByNameQualquerCoisa(String name);

	@Query("{'email': ?0 }")
	User findByEmailQualquerCoisa(String email);

	User findByName(String name);

	User findByNameIgnoreCaseLike(String name);

}
