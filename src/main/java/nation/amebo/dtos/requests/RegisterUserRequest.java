package nation.amebo.dtos.requests;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class RegisterUserRequest {
    private String firstname;
    private String lastname;
    private String password;
    private String username;
}
