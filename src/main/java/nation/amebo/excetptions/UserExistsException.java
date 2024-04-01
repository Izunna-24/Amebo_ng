package nation.amebo.excetptions;

public class UserExistsException extends AmeboNationBlogExceptions {
    public UserExistsException(String message){
        super(message);
    }
}
