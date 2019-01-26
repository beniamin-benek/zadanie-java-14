import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];

        for (int i = 0; i < names.length; i++) {
            System.out.print("Podaj imię " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        for (int i = names.length - 1; i >= 0; i--){
            System.out.println("Cześć " + names[i]);
        }

        /*
        int j = names.length - 1;
        while (j >= 0) {
            System.out.println("Cześć " + names[j]);
            j--;
        } */

    }

}