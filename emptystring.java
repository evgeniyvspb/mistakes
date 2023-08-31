import java.util.Scanner;

public class emptystring {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner scanner = new Scanner(System.in);
        String numb = scanner.nextLine();
        if (numb.equals("")) System.out.println("пустые строки вводить нельзя");
        scanner.close();
        System.out.println(numb);
    }
}
