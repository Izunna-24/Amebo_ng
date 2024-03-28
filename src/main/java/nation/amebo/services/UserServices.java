package nation.amebo.services;

import nation.amebo.dto.RegisterRequest;

public interface UserServices {
void registerUserWith(RegisterRequest registerRequest);
long numberOfRegisteredUsers();
}
