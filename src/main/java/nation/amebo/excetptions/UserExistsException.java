package nation.amebo.excetptions;

public class UserExistsException extends AmeboNationExceptions{
    public UserExistsException(String message){
        super(message);
    }
}
