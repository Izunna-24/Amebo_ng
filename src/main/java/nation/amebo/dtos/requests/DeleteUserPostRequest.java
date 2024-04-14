package nation.amebo.dtos.requests;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class DeleteUserPostRequest {
    private String username;
    private String password;

}
