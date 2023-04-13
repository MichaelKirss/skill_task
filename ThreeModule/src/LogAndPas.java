import java.util.Scanner;

public class LogAndPas {
    public static String inpPrm() {
        Scanner sc = new Scanner(System.in);
        String logOrPas = sc.next();
        return logOrPas;
    }


}
class InputParameter{
    String login;
    String password;
    String temp;
    int minLength;
    int maxLength;
}
