package nation.amebo.services;


import nation.amebo.data.repositories.UserRepository;
import nation.amebo.dto.RegisterRequest;
import nation.amebo.excetptions.AmeboNationExceptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserServicesImplTest {
    @Autowired
    private UserServices userServices;
    @Autowired
    private UserRepository userRepository;
    @BeforeEach
    public void provided(){
        userRepository.deleteAll();
    }
    @Test
    public void registerUser_usersCountIsOneTest() {
        RegisterRequest registerRequest = new RegisterRequest();
        registerRequest.setFirstname("Bliss");
        registerRequest.setLastname("Hamcrest");
        registerRequest.setUsername("username");
        registerRequest.setPassword("password");
        userServices.registerUserWith(registerRequest);
        assertEquals(1, userRepository.count());
    }

        @Test
        public void registerNonUser_usersCountThrowsUserExistException() {
        RegisterRequest registerRequest = new RegisterRequest();
        registerRequest.setFirstname("Bliss");
        registerRequest.setLastname("Hamcrest");
        registerRequest.setUsername("username");
        registerRequest.setPassword("password");
        userServices.registerUserWith(registerRequest);
        assertEquals(1, userRepository.count());
    try {
        userServices.registerUserWith(registerRequest);

    }catch (AmeboNationExceptions e){
        assertEquals(e.getMessage(),"User exists");
    }
    }
}