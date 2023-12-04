import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите арифметическое выражение (например, 2 + 3):");
            String input = scanner.nextLine();
            String[] tokens = input.split(" ");
            if (tokens.length != 3) {
                throw new IllegalArgumentException("Некорректный формат ввода");
            }
            int a = Integer.parseInt(tokens[0]);
            if((a<=1 || a>=11)){
                throw new ArithmeticException("Ошибка: Введите целые числа от 1 до 10");}
            int b = Integer.parseInt(tokens[2]);
            if((b<=1 || b>=11)){
                throw new ArithmeticException("Ошибка: Введите целые числа от 1 до 10");}
            int result;
            switch (tokens[1]) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    result = a / b;
                    break;
                default:
                    throw new IllegalArgumentException("Неподдерживаемая арифметическая операция");
            }
            System.out.println("Результат: " + result);
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.err.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}