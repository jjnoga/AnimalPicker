import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int animal = 0;
        int animalOptions = 3;

        while (animal <= 0 || animal > animalOptions) {
            System.out.println("Choose an animal you would like to see: 1. Dog, 2. Cat, 3. Fish");
            animal = scan.nextInt();
        }

        switch (animal) {
            case 3:
                System.out.println("|\\   \\\\\\\\__     o\n| \\_/    o \\    o \n> _   (( <_  oo  \n| / \\__+___/      \n|/     |/");
                break;
            case 2:
                System.out.println(" _._     _,-'\"\"`-._\r\n" + //
                                        "(,-.`._,'(       |\\`-/|\r\n" + //
                                        "    `-.-' \\ )-`( , o o)\r\n" + //
                                        "          `-    \\`_`\"'-");
                break;
            default:
                System.out.println("  __      _ \n" + //
                                        "o\'\')}____// \n" + //
                                        " `_/      ) \n" + //
                                        " (_(_/-(_/");
        }
    }
}
