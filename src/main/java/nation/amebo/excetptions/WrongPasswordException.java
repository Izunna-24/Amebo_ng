package nation.amebo.excetptions;

public class WrongPasswordException extends AmeboNationBlogExceptions{
    public WrongPasswordException(String message){
        super(message);
    }
}
