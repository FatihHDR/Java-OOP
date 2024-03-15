import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibrarySystem LibrarySystem = new LibrarySystem();
        LibrarySystem.run();
    }
}

class LibrarySystem {
    private Buku[] daftarBuku = new Buku[100];
    private Student[] daftarMahasiswa = new Student[100];
    private int jumlahMahasiswa = 0;
    private int jumlahBuku = 0;

    private void tampilkanMenu() {
        System.out.println("===== Library System =====");
        System.out.println("1. Login sebagai Admin");
        System.out.println("2. Login sebagai Mahasiswa");
        System.out.println("3. Keluar");
    }

    public void run() {
        isiBukuAwal();

        int pilihan;
        Scanner scanner = new Scanner(System.in);

        do {
            tampilkanMenu();
            System.out.print("Pilih (1-3): ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    Admin admin = new Admin(this, scanner);
                    admin.login();
                    break;
                case 2:
                    SistemMahasiswa sistemMahasiswa = new SistemMahasiswa(this, scanner);
                    sistemMahasiswa.login();
                    break;
                case 3:
                    System.out.println("Memproses Logout...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 3);

        scanner.close();
    }

    private void isiBukuAwal() {
        daftarBuku = new Buku[100];
        tambahBuku(new Buku("1111", "pristel tas tas tas", "aku", "Komedi", 5));
        tambahBuku(new Buku("2222", "tutor slepet", "king anis", "Horror", 2));
        tambahBuku(new Buku("3333", "meong", "ahok", "Fiksi",1));
        tambahBuku(new Buku("4444", "poopoo", "siapa", "Sci-fi",5));
        tambahBuku(new Buku("5555", "hah", "kurang tau", "Fiksi",6));

    }


    public void tambahBuku(Buku buku) {
        if (jumlahBuku < daftarBuku.length) {
            daftarBuku[jumlahBuku++] = buku;
        } else {
            System.out.println("Daftar buku sudah penuh. tidak bisa menambah lagi.");
        }
    }

    public Buku[] getDaftarBuku() {

        return daftarBuku;
    }

    public void setDaftarBuku(Buku[] daftarBuku) {

        this.daftarBuku = daftarBuku;
    }

    public Student[] getDaftarMahasiswa() {

        return daftarMahasiswa;
    }

    public void setDaftarMahasiswa(Student[] daftarMahasiswa) {

        this.daftarMahasiswa = daftarMahasiswa;
    }

    public int getJumlahMahasiswa() {

        return jumlahMahasiswa;
    }

    public void setJumlahMahasiswa(int jumlahMahasiswa) {

        this.jumlahMahasiswa = jumlahMahasiswa;
    }

    public int getJumlahBuku() {

        return jumlahBuku;
    }

    public void setJumlahBuku(int jumlahBuku) {

        this.jumlahBuku = jumlahBuku;
    }
}

class SistemMahasiswa {
    private LibrarySystem LibrarySystem;
    private Scanner scanner;

    public SistemMahasiswa(LibrarySystem LibrarySystem, Scanner scanner) {
        this.LibrarySystem = LibrarySystem;
        this.scanner = scanner;
    }

    public void login() {
        // Implementasi login untuk mahasiswa
        menuMahasiswa();
    }

    private void menuMahasiswa() {
        int pilihan;
        do {
            tampilkanMenuMahasiswa();
            System.out.print("Pilih (1-4): ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    tampilkanDaftarBuku();
                    break;
                case 2:
                    pinjamBuku();
                    break;
                case 3:
                    kembalikanBuku();
                    break;
                case 4:
                    System.out.println("Keluar dari akun Mahasiswa.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 4);
    }

    private void tampilkanMenuMahasiswa() {
        System.out.println("\n===== Menu Mahasiswa =====");
        System.out.println("1. Tampilkan Daftar Buku");
        System.out.println("2. Pinjam Buku");
        System.out.println("3. Kembalikan Buku");
        System.out.println("4. Logout");
    }
    private void tampilkanDaftarBuku() {
        Buku[] buku = LibrarySystem.getDaftarBuku();
        System.out.println("\n===== Daftar Buku =====");
        for (int i = 0; i < LibrarySystem.getJumlahBuku(); i++) {
            System.out.println("ID: " + buku[i].getId());
            System.out.println("Judul: " + buku[i].getJudul());
            System.out.println("Penulis: " + buku[i].getPenulis());
            System.out.println("Jumlah: " + buku[i].getStok());
            System.out.println();
        }
    }

    private void pinjamBuku() {
        System.out.print("Masukkan ID Buku yang ingin dipinjam: ");
        String idBuku = scanner.next();
        Buku buku = cariBukuById(idBuku);
        if (buku != null && buku.getStok() > 0) {
            buku.setStok(buku.getStok() - 1);
            System.out.println("Buku berhasil dipinjam!");
        } else {
            System.out.println("Stok buku habis atau tidak ditemukan.");
        }
    }

    private void kembalikanBuku() {
        System.out.print("Masukkan ID Buku yang ingin dikembalikan: ");
        String idBuku = scanner.next();
        Buku buku = cariBukuById(idBuku);
        if (buku != null) {
            buku.setStok(buku.getStok() + 1);
            System.out.println("Buku berhasil dikembalikan!");
        } else {
            System.out.println("Buku tidak ditemukan.");
        }
    }

    private Buku cariBukuById(String id) {
        for (int i = 0; i < LibrarySystem.getJumlahBuku(); i++) {
            if (LibrarySystem.getDaftarBuku()[i].getId().equals(id)) {
                return LibrarySystem.getDaftarBuku()[i];
            }
        }
        return null;
    }

}

