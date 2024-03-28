package nation.amebo.services;


import nation.amebo.data.repositories.UserRepository;
import nation.amebo.dto.RegisterRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserServicesImpTest {
    @Autowired
    private UserServices userServices;

    @Test
    public void registerUser_usersCountIsOneTest() {
        RegisterRequest registerRequest = new RegisterRequest();
        registerRequest.setFirstname("Bliss");
        registerRequest.setLastname("Hamcrest");
        registerRequest.setUsername("username");
        registerRequest.setPassword("password");
        userServices.registerUserWith(registerRequest);
        assertEquals(1, userServices.numberOfRegisteredUsers());

    }
}