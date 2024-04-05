import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a character: ");
        String sym = scnr.nextLine();

        System.out.println("Enter triangle height: ");
        String heightS = scnr.nextLine();
        int heightI = Integer.parseInt(heightS);

        int count = 0;
        for (int i = 0; i < heightI; i++) {
            count++;
            for (int j = 0; j < count; j++) {
                System.out.print(sym + " ");
            }
            System.out.print("\n");
        }

        scnr.close();
    }
}
