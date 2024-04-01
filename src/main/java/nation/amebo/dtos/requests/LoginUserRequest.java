package nation.amebo.dtos.requests;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class LoginUserRequest {
    private String username;
    private String password;
}
