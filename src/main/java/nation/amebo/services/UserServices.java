package nation.amebo.services;

import nation.amebo.dto.RegisterRequest;
import org.springframework.stereotype.Service;

@Service
public interface UserServices {
void registerUserWith(RegisterRequest registerRequest);
//long numberOfRegisteredUsers();
}
