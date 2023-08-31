import java.util.Scanner;

public class enterfloat {
    public static void main(String[] args) {
        
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        String numb = scanner.nextLine();
        try {
            Integer numb1 = Integer.parseInt(numb);
        } catch (NumberFormatException e) {
            System.out.println("повторно запрашиваем у пользователя ввод данных");
            System.out.println("Enter CORRECT  the number");
            Integer numb1 = scanner.nextInt();
            scanner.close();
        }
    }
}
