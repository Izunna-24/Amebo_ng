package nation.amebo.services;

import nation.amebo.data.models.User;
import nation.amebo.data.repositories.UserRepository;
import nation.amebo.dtos.requests.LoginUserRequest;
import nation.amebo.dtos.requests.RegisterUserRequest;
import nation.amebo.excetptions.UserExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static nation.amebo.utilities.Mapper.map;

@Service
public class UserServicesImpl implements UserServices {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void registerUserWith(RegisterUserRequest registerUserRequest) {
        registerUserRequest.setUsername(registerUserRequest.getUsername().toLowerCase());
        validateRegistration(registerUserRequest.getUsername());
        User user = map(registerUserRequest);
        userRepository.save(user);
    }



    private void validateRegistration(String username) {
        boolean userExists = userRepository.existsById(username);
        if (userExists) throw new UserExistsException("User exists");
    }


    @Override
    public void login(LoginUserRequest loginUserRequest) {
    User user = new User();
    user.setPassword(loginUserRequest.getPassword());
    user.setUsername(loginUserRequest.getUsername());
    }
}



