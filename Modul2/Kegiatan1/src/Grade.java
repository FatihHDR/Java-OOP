import java.util.Scanner;

public class Grade {
    private int progdas, kalkulus, orkom;
    private double average;

    public void setProgdas(int progdas) {
        this.progdas = progdas;
    }

    public int getProgdas() {
        return progdas;
    }

    public void setKalkulus(int kalkulus) {
        this.kalkulus = kalkulus;
    }

    public int getKalkulus() {
        return kalkulus;
    }

    public void setOrkom(int orkom) {
        this.orkom = orkom;
    }

    public int getOrkom() {
        return orkom;
    }

    public double calculateAverage() {
        this.average = (getProgdas() + getKalkulus() + getOrkom()) / 3.0;
        return average;
    }

    public void displayGrades() {
        System.out.println("\nNilai kamu: ");
        System.out.println("Progdas\t\t: " + getProgdas());
        System.out.println("Kalkulus\t: " + getKalkulus());
        System.out.println("Orkom\t\t: " + getOrkom());

        System.out.println("Rata-rata\t: " + calculateAverage());
        if (calculateAverage() > 70) {
            System.out.println("Status\t\t: LULUS");
        } else {
            System.out.println("Status\t\t: GAGAL");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Grade grade = new Grade();

        System.out.print("Masukkan nilai progdas: ");
        grade.setProgdas(input.nextInt());

        System.out.print("Masukkan nilai kalkulus: ");
        grade.setKalkulus(input.nextInt());

        System.out.print("Masukkan nilai orkom: ");
        grade.setOrkom(input.nextInt());

        grade.displayGrades();
    }
}