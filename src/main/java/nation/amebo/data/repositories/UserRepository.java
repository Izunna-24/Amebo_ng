package nation.amebo.data.repositories;


import nation.amebo.data.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<User, String> {

}
