package nation.amebo.services;


import nation.amebo.data.repositories.UserRepository;
import nation.amebo.dtos.requests.RegisterUserRequest;
import nation.amebo.excetptions.AmeboNationBlogExceptions;
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
        RegisterUserRequest registerUserRequest = new RegisterUserRequest();
        registerUserRequest.setFirstname("Bliss");
        registerUserRequest.setLastname("Hamcrest");
        registerUserRequest.setUsername("username");
        registerUserRequest.setPassword("password");
        userServices.registerUserWith(registerUserRequest);
        assertEquals(1, userRepository.count());
    }

        @Test
        public void registerSameUserTwice_usersCountThrowsUserExistException() {
        RegisterUserRequest registerUserRequest = new RegisterUserRequest();
        registerUserRequest.setFirstname("Bliss");
        registerUserRequest.setLastname("Hamcrest");
        registerUserRequest.setUsername("username");
        registerUserRequest.setPassword("password");
        userServices.registerUserWith(registerUserRequest);
        assertEquals(1, userRepository.count());
    try {
        userServices.registerUserWith(registerUserRequest);

    }catch (AmeboNationBlogExceptions e){
        assertEquals(e.getMessage(),"User exists");
    }
    }
}