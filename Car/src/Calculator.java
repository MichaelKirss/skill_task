import java.util.InputMismatchException;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
      System.out.println("Введите 1 чтобы начать. Другое значение - выход");
      int job = num();
      while (job == 1) {
            calculate();
            System.out.println("Продолжаем? Введите 1. Другое значение - выход");
            job = num();
      }
    }
    public static void calculate() throws ArithmeticException {
        try {
            System.out.println("Ввкдите первое число");
            int firstArg = num();
            if (firstArg == 2147483647) return;
            System.out.println("Ввкдите необходимое действие");
            char div = action();
            if (div == 'e') {
                System.out.println("Введенное значение не является действием");
                return;
            }
            System.out.println("Ввкдите второе число");
            int twoArg = num();
            System.out.println("Результат");
            float result = 0;
            switch (div) {
                case '+':
                    result = firstArg + twoArg;
                    break;
                case '-':
                    result = firstArg - twoArg;
                    break;
                case '*':
                    result = firstArg * twoArg;
                    break;
                case '/':
                    result = firstArg / twoArg;
                    break;
                default:
                    break;
            }
            System.out.println(result);
        } catch (Exception e){
            System.out.println("Делить на ноль нельзя");
        }

    }
    public static int num() throws InputMismatchException {
          Scanner scaner = new Scanner(System.in);
          try {
              int operand = scaner.nextInt();
              return operand;
          } catch (Exception e) {
              System.out.println("Вы ввели не число");
          }
        return 2147483647;
    }
    public static char action(){
        Scanner scaner = new Scanner(System.in);
        char act = scaner.next().charAt(0);
        switch (act){
            case '+':
                break;
            case'-':
                break;
            case '*':
                break;
            case'/':
                break;
            default:
                act = 'e';
        }
        return act;
    }
}
