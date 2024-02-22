import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int animal = 0;

        
        System.out.println("Choose an animal you would like to see: 1. Dog, 2. Cat");
        animal = scan.nextInt();

        switch (animal) {
            case 2:
                System.out.println("CAT ASCII ART HERE");
                break;
            case 1:
                System.out.println("DOG ASCII ART HERE");
                break;
            default:
                System.out.println("Error! Selection not valid.");
        }
    }
}
