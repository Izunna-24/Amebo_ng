package nation.amebo.services;

import nation.amebo.data.models.Post;
import nation.amebo.data.models.User;
import nation.amebo.data.repositories.PostRepository;
import nation.amebo.data.repositories.UserRepository;
import nation.amebo.dtos.requests.CreatePostRequest;
import nation.amebo.dtos.requests.DeleteUserPostRequest;
import nation.amebo.dtos.requests.LoginRequest;
import nation.amebo.dtos.requests.RegisterUserRequest;
import nation.amebo.excetptions.UserDoesNotExistException;
import nation.amebo.excetptions.UserExistsException;
import nation.amebo.excetptions.WrongPasswordException;
import nation.amebo.excetptions.WrongUserNameException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static nation.amebo.utilities.Mapper.map;

@Service
public class UserServicesImpl implements UserServices {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    @Override
    public void registerUserWith(RegisterUserRequest registerUserRequest) {
        registerUserRequest.setUsername(registerUserRequest.getUsername().toLowerCase());
        validateRegistration(registerUserRequest.getUsername());
        User user = map(registerUserRequest);
        userRepository.save(user);
    }



    private void validateRegistration(String username) {
        boolean userExists = userRepository.existsById(username);
        if (userExists) throw new UserExistsException(String.format("%s exists",username));
    }


    @Override
    public void login(LoginRequest loginRequest) {
        User user = new User();
        user.setPassword(loginRequest.getPassword());
        user.setUsername(loginRequest.getUsername());
        userRepository.findByUsername(loginRequest.getUsername());
        loginValidation(loginRequest, user);
        user.setLoggedIn(false);
        userRepository.save(user);
    }

    private static void loginValidation(LoginRequest loginRequest, User user) {
        if (!user.getUsername().equalsIgnoreCase(loginRequest.getUsername())) {
            throw new WrongUserNameException("Invalid login detail, try again!");
        }
        if (!user.getPassword().equals(loginRequest.getPassword())) {
            throw new WrongPasswordException("Invalid login detail, try again");
        }
    }

    @Override
    public User findByUsername(String username) {
        Optional<User> user = userRepository.findByUsername(username);
        if (user.isEmpty()) throw new UserDoesNotExistException(String.format("%s is not found! ", username));
     return user.get();
    }

    @Override
    public Post createPost(CreatePostRequest createPostRequest) {
        User user = new User();
        user.setUsername(createPostRequest.getPoster());

        Post post = new Post();
        post.setTitle(createPostRequest.getTitle());
        post.setContent(createPostRequest.getContent());
        return post;
    }

    @Override
    public void deletePost(DeleteUserPostRequest deleteUserPostRequest) {
       // Post createdPost = postRepository.findByContent(deleteUserPostRequest.)
    }

}





