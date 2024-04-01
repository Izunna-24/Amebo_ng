package nation.amebo.controllers;

import nation.amebo.dtos.requests.RegisterUserRequest;
import nation.amebo.excetptions.AmeboNationBlogExceptions;
import nation.amebo.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    @Autowired
    private UserServices userServices;

@PostMapping("/register")
    public String registerUser(@RequestBody RegisterUserRequest registerUserRequest){

        try {
            userServices.registerUserWith(registerUserRequest);
            return String.format("%s your registration to Amebo_ng is successful", registerUserRequest.getUsername());
        } catch (AmeboNationBlogExceptions error){
            return error.getMessage();
        }
    }
}
