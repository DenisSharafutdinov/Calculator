import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerS = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Введите первое число:");
                int val1 = scanner.nextInt();
                System.out.println("Выберите операцию (*, /, +, -):");
                String oper = scannerS.nextLine();
                System.out.println("Введите второе число:");
                int val2 = scanner.nextInt();
                if (oper.equals("*"))
                    System.out.println("Ответ:" +(val1*val2));
                else
                if (oper.equals("/") && (val2 != 0)) {
                    System.out.println("Ответ:" +(double) val1 / val2);
                }
                else
                if (oper.equals("+"))
                    System.out.println("Ответ:" +(val1+val2));
                else
                if (oper.equals("-"))
                    System.out.println("Ответ:" +(val1-val2));
                else
                    System.out.println("Неправильная операция");
                System.out.println("Хотите продолжить? (Y / N)");
                oper = scannerS.nextLine();
                if (!oper.equals("Y"))
                    break;
            }
            catch (InputMismatchException e) {
                System.out.println("Некорректное число");
                break;
            }
        }
    }
}