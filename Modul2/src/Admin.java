import java.util.Scanner;

public class Admin {
    private LibrarySystem LibrarySystem;
    private Scanner scanner;
    private String namaAdmin;
    private String pswdAdmin;

    public Admin(LibrarySystem LibrarySystem, Scanner scanner) {
        this.LibrarySystem = LibrarySystem;
        this.scanner = scanner;
    }

    public void login() {
        // Implementasi login untuk admin
        menuAdmin();
    }

    private void menuAdmin() {
        int pilihan;
        do {
            tampilkanMenuAdmin();
            System.out.print("Pilih (1-3): ");
            pilihan = scanner.nextInt();
            switch (pilihan) {
                case 1:
                    tambahMahasiswa();
                    break;
                case 2:
                    tampilkanMahasiswa();
                    break;
                case 3:
                    System.out.println("Keluar dari akun Admin.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 3);
    }
    private void tampilkanMenuAdmin() {
        System.out.println("\n===== Menu Admin =====");
        System.out.println("1. Tambah Mahasiswa");
        System.out.println("2. Tampilkan Mahasiswa");
        System.out.println("3. Logout");
    }

    private void tampilkanMahasiswa() {
        Student[] student = LibrarySystem.getDaftarMahasiswa();
        System.out.println("\n===== Daftar Mahasiswa =====");

        for (int i = 0; i < LibrarySystem.getJumlahMahasiswa(); i++) {
            System.out.println("Nama: " + student[i].getNama());
            System.out.println("NIM: " + student[i].getNim());
            System.out.println("Fakultas: " + student[i].getFakultas());
            System.out.println("Program Studi: " + student[i].getProgramStudi());
            System.out.println();
        }
    }

    private void tambahMahasiswa() {
        scanner.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        System.out.print("Masukkan Fakultas: ");
        String fakultas = scanner.nextLine();
        System.out.print("Masukkan Program Studi: ");
        String programStudi = scanner.nextLine();

        Student student = new Student(nama, nim, fakultas, programStudi);
        LibrarySystem.getDaftarMahasiswa()[LibrarySystem.getJumlahMahasiswa()] = student;
        LibrarySystem.setJumlahMahasiswa(LibrarySystem.getJumlahMahasiswa() + 1);

        System.out.println("Mahasiswa berhasil ditambahkan.");
    }
}