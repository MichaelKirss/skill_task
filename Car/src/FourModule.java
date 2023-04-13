import java.util.Scanner;
public class FourModule {
    public static void main(String[] args){
        Scanner name = new Scanner(System.in);
        String nameStr = name.nextLine();
//        String nameStr = "1234 123456     12345678";
        checkUserName(nameStr);
    }
    public static void checkUserName(String name) {
        String nameShort = deleteSpace(name);
        System.out.println(nameShort);
        String x = "Иван Иванов";
        if (x.equalsIgnoreCase(name)) {
            System.out.println("Выберите другое имя пользователя");
        } else {
//            System.out.println("Отличное имя!");
            System.out.println("Ваше имя имеет длину "+ name.length()+" символов");
            System.out.println("Ваше имя имеет длину "+ nameShort.length()+" символов без пробелов");
        }
    }
    public static String deleteSpace(String name){
        boolean  state = true;
        String nameNoSpace = name.trim();
        while (state) {
            int i = nameNoSpace.indexOf(' ');
            if (i==-1){
                state = false;
//                System.out.println(i);
                return nameNoSpace;
            }else{
                String tempNameFirst = "";
                String tempNameEnd = "";
                tempNameEnd = nameNoSpace.substring(i+1);
                tempNameFirst = nameNoSpace.substring(0,i+1).trim();
                nameNoSpace = tempNameFirst+tempNameEnd;
                System.out.println(tempNameFirst);
                System.out.println(tempNameEnd);
                state = true;
            }
        }
       return nameNoSpace;
    }
}
