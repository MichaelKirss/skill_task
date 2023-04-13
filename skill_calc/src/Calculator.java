import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
//        System.out.println("Введите C чтобы начать. 's' - выход");
        char mode = 'C';
        while (mode != 's') {
            if (mode == 's') return;
            if (mode != 'C') {
                System.out.println("Введите C чтобы начать снова. 's' - выход");
            }
            calculate();
            System.out.println("Введите C чтобы начать снова. 's' - выход");
            mode = workMode();
        }

    }

    public static char action() {
        Scanner scaner = new Scanner(System.in);
        char act = scaner.next().charAt(0);
        return act;
    }

    public static char workMode() {
        char job = action();
        if (job == 'C' || job == 's') {
        } else {
            System.out.println("Вы нажали не разрешенный символ. Попробуйте снова");
        }
        return job;
    }

    public static void calculate() throws ArithmeticException {
        try {
            System.out.println("Введите первое число");
            float firstArg = num();
            System.out.println("Введите необходимое действие");
            char div = action();
            if (div == '+' || div == '-' || div == '*' || div == '/') {
            } else {
                System.out.println("Введенное значение не является действием");
                return;
            }
            System.out.println("Введите второе число");
            float twoArg = num();
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
        } catch (Exception e) {
            System.out.println("Введено не число или произведено деление на ноль");
        }
    }

    public static int num() {
        Scanner scaner = new Scanner(System.in);
        int operand = scaner.nextInt();
        return operand;
    }
}
