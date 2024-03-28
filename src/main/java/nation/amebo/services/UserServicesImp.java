package nation.amebo.services;

import nation.amebo.data.models.User;
import nation.amebo.data.repositories.UserRepository;
import nation.amebo.dto.RegisterRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServicesImp implements UserServices{
    @Autowired
    private UserRepository userRepository;
    @Override
    public void registerUserWith(RegisterRequest registerRequest) {
        User user = new User();
        user.setFirstname(registerRequest.getFirstname());
        user.setLastname(registerRequest.getLastname());
        user.setUsername(registerRequest.getPassword());
        user.setPassword(registerRequest.getPassword());
        userRepository.save(user);



    }
}
