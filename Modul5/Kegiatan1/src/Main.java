import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DinasPertanahan[] dinasPertanahans = new DinasPertanahan[100];
        int i = 0;

        while (true) {
            System.out.println("Input data ke-" + (i + 1));
            System.out.print("Alamat: ");
            String alamat = scanner.nextLine();
            System.out.print("Panjang Tanah: ");
            int panjangTanah = scanner.nextInt();
            System.out.print("Luas Tanah: ");
            int luasTanah = scanner.nextInt();

            try {
                dinasPertanahans[i] = new DinasPertanahan(alamat, panjangTanah, luasTanah);
                dinasPertanahans[i].display();
                i++;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

            System.out.print("Lanjut po ra? (y/n): ");
            String continueInput = scanner.next();
            if (!continueInput.equalsIgnoreCase("y")) {
                break;
            }
        }

        System.out.println("Matur suwun lek.");
    }
}
