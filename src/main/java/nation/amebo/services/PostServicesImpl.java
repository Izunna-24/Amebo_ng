package nation.amebo.services;

import nation.amebo.data.repositories.PostRepository;
import nation.amebo.dto.CreatePostRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServicesImpl implements PostServices {

    @Autowired
    private PostRepository postRepository;
    @Override
    public void createPost(CreatePostRequest createPostRequest) {
        //Post post = new Post();


    }
}
