public class Main {
    public static void main(String[] args) {
        int a = 100;
        int b = 100;
        int difference = a - b;

        int d = 100;
        int e = 100;
        int quotient = d / e;

        boolean result = difference > quotient;

        if (result) {
            System.out.println("Berhasil");
        } else {
            System.out.println("Gagal");
        }
    }
}
