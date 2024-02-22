import java.util.Scanner;

public class Student {
    private String name, nim, password;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNIM(String nim) {
        this.nim = nim;
    }

    public String getNIM() {
        return nim;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void daftar() {
        System.out.println("\nSelamat " + getName() + " Anda berhasil daftar\n");
        System.out.println("Berikut username dan password anda :");
        System.out.println("Username : " + getNIM());
        System.out.println("Password : " + getPassword());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student std = new Student();

        String name, nim, password;
        int length, loop;

        System.out.println("===DAFTAR===\n");

        System.out.print("Nama\t\t: ");
        name = input.nextLine();

        do {
            System.out.print("NIM\t\t: ");
            nim = input.nextLine();
            length = nim.length();
            if(length == 15) {
                loop = 0;
            } else {
                System.out.println("NIM harus berjumlah 15 angka");
                loop = 1;
            }
        } while(loop == 1);

        do {
            System.out.print("Password\t: ");
            password = input.nextLine();
            length = password.length();
            if(length >= 8) {
                loop = 0;
            } else {
                System.out.println("Password minimal 8 karakter");
                loop = 1;
            }
        } while(loop == 1);

        std.setName(name);
        std.setNIM(nim);
        std.setPassword(password);

        std.daftar();
    }
}