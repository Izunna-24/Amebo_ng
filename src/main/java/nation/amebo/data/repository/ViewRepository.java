package nation.amebo.data.repository;

import nation.amebo.data.model.View;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViewRepository extends MongoRepository<View, String> {
}
