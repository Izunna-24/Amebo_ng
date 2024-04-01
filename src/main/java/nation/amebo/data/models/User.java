package nation.amebo.data.models;

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
    private boolean isLoggedIn = true;

    @Id
    private String id;

    @DBRef
    private List<Post> posts;
    //private Role role;

}
