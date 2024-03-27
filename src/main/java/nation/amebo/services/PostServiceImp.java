package nation.amebo.services;

import nation.amebo.data.repository.PostRepository;
import nation.amebo.dto.CreatePostRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImp implements PostService{

    @Autowired
    private PostRepository postRepository;
    @Override
    public void createPost(CreatePostRequest createPostRequest) {

    }
}
