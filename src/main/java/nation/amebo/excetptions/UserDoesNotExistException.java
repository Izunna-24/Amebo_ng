package nation.amebo.excetptions;

public class UserDoesNotExistException extends AmeboNationBlogExceptions{
    public UserDoesNotExistException(String message){
        super(message);
    }
}
