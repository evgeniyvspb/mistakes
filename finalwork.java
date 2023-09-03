import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class finalwork {
    public static void main(String[] args) {
        System.out.println(
                "введите данные в произвольном порядке: ФИО, дата рождения, номер теелфона и пол");
        Scanner scanner = new Scanner(System.in);
        String numb = scanner.nextLine();
        if (numb.equals("")) {
            System.out.println("пустые строки вводить нельзя");
            System.exit(1);
        }
        String[] meaning = numb.split(" ", 0);
        Boolean mistakes = true;
        while (mistakes == true) {
            if (meaning.length < 6) {
                System.out.println("Каких то данных явно не хватает. Давайте попробуем заново");
                numb = scanner.nextLine();
                meaning = numb.split(" ", 0);
            } else if (meaning.length > 6) {
                System.out.println("Каких то данных явно лишние. Давайте попробуем заново");
                numb = scanner.nextLine();
                meaning = numb.split(" ", 0);
            } else
                mistakes = false;
        }
        try {
            Date datebirth = new SimpleDateFormat("dd.mm.yyyy").parse(meaning[3].toString());
            meaning[3] = datebirth.toString();
        } catch (ParseException e) {
            System.out.println("и что то не так с вводом даты");
            System.err.println(e);

        }
        try {
            Double numberTel = Double.parseDouble(meaning[4].toString());
            meaning[4] = numberTel.toString();
        } catch (NumberFormatException e) {
            System.out.println("и что то не так с вводом номера телефона");
            System.err.println(e);
        }
        while (!meaning[5].equals("f") && !meaning[5].equals("m")) { // || meaning[5] != "m"
            System.out.println("С вводом пола проблемы. Надо ввести или f или m. Давайте попробуем ещё раз");
            meaning[5] = scanner.nextLine();
        }
        scanner.close();
        try {
            Writer output;
            output = new BufferedWriter(new FileWriter(meaning[0].toString() + ".txt", true));
            for (String string : meaning) {
                output.append("<" + string + ">");
            }
            output.append('\n');
            output.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
