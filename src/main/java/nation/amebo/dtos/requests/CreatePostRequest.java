package nation.amebo.dtos.requests;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document
public class CreatePostRequest {
    private String title;
    private String content;
    private String poster;
    private LocalDateTime dateCreated = LocalDateTime.now();
}
