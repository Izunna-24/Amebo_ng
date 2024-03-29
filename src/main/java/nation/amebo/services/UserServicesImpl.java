package nation.amebo.services;

import nation.amebo.data.models.User;
import nation.amebo.data.repositories.UserRepository;
import nation.amebo.dto.RegisterRequest;
import nation.amebo.excetptions.UserExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static nation.amebo.utilities.Mapper.map;

@Service
public class UserServicesImpl implements UserServices {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void registerUserWith(RegisterRequest registerRequest) {
        registerRequest.setUsername(registerRequest.getUsername().toLowerCase());
        validateReg(registerRequest.getUsername());
        User user = map(registerRequest);
        userRepository.save(user);
    }

    private void validateReg(String username) {
        boolean userExists = userRepository.existsById(username);
        if (userExists) throw new UserExistsException("User exists");
    }
}



