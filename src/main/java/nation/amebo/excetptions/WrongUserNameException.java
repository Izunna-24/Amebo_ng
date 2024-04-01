package nation.amebo.excetptions;

public class WrongUserNameException extends AmeboNationBlogExceptions{
    public WrongUserNameException(String message){
        super(message);
    }
}
