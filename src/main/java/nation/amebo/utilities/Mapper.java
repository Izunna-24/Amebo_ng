package nation.amebo.utilities;

import nation.amebo.data.models.User;
import nation.amebo.dtos.requests.RegisterUserRequest;

public class Mapper {
    public static User map(RegisterUserRequest registerUserRequest){
        User user = new User();
        user.setFirstname(registerUserRequest.getFirstname());
        user.setLastname(registerUserRequest.getLastname());
        user.setUsername(registerUserRequest.getPassword());
        user.setPassword(registerUserRequest.getPassword());
        return user;
    }
}
