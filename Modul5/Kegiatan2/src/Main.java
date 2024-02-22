import java.io.*;
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

            System.out.print("Lanjut po ra?(y/n): ");
            String continueInput = scanner.next();
            if (!continueInput.equalsIgnoreCase("y")) {
                break;
            }
        }

        try {
            FileWriter fileWriter = new FileWriter("dinasPertanahan.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (int j = 0; j < i; j++) {
                bufferedWriter.write(dinasPertanahans[j].toString());
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            System.out.println("Data telah berhasil ditulis ke file.");

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        } finally {
            System.out.println("Program dimatikan.");
        }

        try {
            FileReader fileReader = new FileReader("dinasPertanahan.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                String alamat = data[0];
                int panjangTanah = Integer.parseInt(data[1]);
                int luasTanah = Integer.parseInt(data[2]);

                DinasPertanahan dp = new DinasPertanahan(alamat, panjangTanah, luasTanah);
                dp.display();
            }

            bufferedReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("File tidak temukan: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error membaca file: " + e.getMessage());
        }
    }
}