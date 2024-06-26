package nation.amebo.data.repositories;

import nation.amebo.data.models.Post;
import nation.amebo.data.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
   // Optional<Post> findByContent(String content);
}


