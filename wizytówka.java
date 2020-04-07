package pl.javastart.first;
import java.util.Scanner;

public class Test11 {
    private static Scanner scanner;

	public static void main (String args[])
    {
        scanner = new Scanner(System.in);
        String name = scanner.next();
        String surname = scanner.next();
        int telephone = scanner.nextInt();

        System.out.println("*______________________________*");
        System.out.println("| NAME         | " + name        );
        System.out.println("| SURNAME      | " + surname     );
        System.out.println("| TELEPHONE    | " + telephone   );
        System.out.println("*______________________________*");
    }

}
