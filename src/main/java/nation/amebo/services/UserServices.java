package nation.amebo.services;

import nation.amebo.dtos.requests.LoginUserRequest;
import nation.amebo.dtos.requests.RegisterUserRequest;
import org.springframework.stereotype.Service;

@Service
public interface UserServices {
void registerUserWith(RegisterUserRequest registerUserRequest);
void login(LoginUserRequest loginUserRequest);
}
