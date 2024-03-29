package nation.amebo.utilities;

import nation.amebo.data.models.User;
import nation.amebo.dto.RegisterRequest;

public class Mapper {
    public static User map(RegisterRequest registerRequest){
        User user = new User();

        user.setFirstname(registerRequest.getFirstname());
        user.setLastname(registerRequest.getLastname());
        user.setUsername(registerRequest.getPassword());
        user.setPassword(registerRequest.getPassword());
        return user;
    }
}
