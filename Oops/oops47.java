@FunctionalInterface
interface Logger{
    void log(String msg);
}

public class oops47 {
    public static void main(String[] args) {
        Logger infoLogger = msg -> System.out.println("Info: "+msg);
        Logger errorLogger = msg -> System.out.println("Error: "+msg);

        infoLogger.log("Server Started");
        errorLogger.log("Connection failed");
    }   
}
