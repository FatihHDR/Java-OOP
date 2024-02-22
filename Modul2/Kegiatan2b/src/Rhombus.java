import java.util.Scanner;

public class Rhombus {
    public int getPerimeter(int sideLength) {
        return (sideLength * 4);
    }

    public double getArea(int diagonal1, int diagonal2) {
        return (0.5 * diagonal1 * diagonal2);
    }

    public void printPerimeter(int sideLength) {
        System.out.println("Keliling belah ketupat dengan panjang sisi " + sideLength + " adalah "
                + this.getPerimeter(sideLength));
    }

    public void printArea(int diagonal1, int diagonal2) {
        System.out.println("Luas belah ketupat dengan panjang diagonal " + diagonal1 + " dan " + diagonal2 + " adalah "
                + this.getArea(diagonal1, diagonal2));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Rhombus rhombus = new Rhombus();

        System.out.println("MENU");
        System.out.println("1. Keliling");
        System.out.println("2. Luas");
        System.out.println("3. Exit");
        System.out.print("Pilih salah satu: ");
        int menu = input.nextInt();

        switch (menu) {
            case 1:
                System.out.println("Masukkan panjang sisi: ");
                rhombus.printPerimeter(input.nextInt());
                break;
            case 2:
                System.out.println("Masukkan panjang diagonal 1: ");
                int diagonal1 = input.nextInt();
                System.out.println("Masukkan panjang diagonal 2: ");
                int diagonal2 = input.nextInt();
                rhombus.printArea(diagonal1, diagonal2);
                break;
            case 3:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }

        input.close();
    }
}