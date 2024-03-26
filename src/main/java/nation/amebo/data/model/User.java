package nation.amebo.data.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Data
@Document("Users")
public class User {
    private String firstname;
    private String lastname;
    private String password;
    private String username;

    @Id
    private String id;

    @DBRef
    private List<Post> posts;

}
