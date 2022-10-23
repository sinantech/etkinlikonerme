import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int heat = inp.nextInt();

        if (heat <= 5) {
            System.out.println("kayak yap");
        } else if (heat <= 15) {
            System.out.println("sinema");
        } else if (heat <= 25) {
            System.out.println("piknik");
        } else {
            System.out.println("yüzme");
        }

    }
}