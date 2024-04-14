package nation.amebo.services;

import nation.amebo.data.models.Post;
import nation.amebo.data.models.User;
import nation.amebo.dtos.requests.CreatePostRequest;
import nation.amebo.dtos.requests.DeleteUserPostRequest;
import nation.amebo.dtos.requests.LoginRequest;
import nation.amebo.dtos.requests.RegisterUserRequest;
import org.springframework.stereotype.Service;

@Service
public interface UserServices {
void registerUserWith(RegisterUserRequest registerUserRequest);
void login(LoginRequest loginRequest);
User findByUsername(String username);
Post createPost(CreatePostRequest createPostRequest);
void deletePost(DeleteUserPostRequest deleteUserPostRequest);
}
