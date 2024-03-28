package nation.amebo.dto;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class RegisterRequest {
    private String firstname;
    private String lastname;
    private String password;
    private String username;
}
