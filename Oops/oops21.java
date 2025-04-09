//Static Method for Validating User Login
class UserValidate{
    @SuppressWarnings("FieldMayBeFinal")
    private String username ; 
    @SuppressWarnings("FieldMayBeFinal")
    private String password ; 

    UserValidate(String username , String password){
        this.username = username; 
        this.password = password ;
    }
    // Factory method --> validate
    static boolean validate(UserValidate user , String username , String password){
        return user.username.equals(username) && user.password.equals(password);
    }
}

public class oops21 {
    public static void main(String[] args) {
        UserValidate u1 = new UserValidate("Vatsal", "1234");

        if(UserValidate.validate(u1, "Vatsal", "134")){
            System.out.println("Login Successful");
        }
        else System.out.println("Invalid credentials");
    }
}
