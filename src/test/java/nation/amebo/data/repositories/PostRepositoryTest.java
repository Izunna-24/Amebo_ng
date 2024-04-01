package nation.amebo.data.repositories;

import nation.amebo.data.models.Post;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@DataMongoTest
class PostRepositoryTest {

    @Autowired
    private PostRepository postRepository;

    @Test
    public void mongoDBCanSavePostsTest(){
        postRepository.deleteAll();
        Post post = new Post();
        postRepository.save(post);
        assertEquals(1, postRepository.count());
        //assertThat(postRepository.count(),);
    }

}