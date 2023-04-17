import java.util.Scanner;

public class PembagianDenganMethod {

    // Method static untuk menghitung hasil pembagian
    public static int HitungPembagian(int angka1, int angka2) {
        if (angka2 == 0) {
            System.out.println("Angka pembagi tidak boleh nol!");
            System.exit(1);
        }
        return (angka1/angka2);
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta user untuk memasukkan dua angka integer
        System.out.println("Masukkan dua buah angka integer: ");
        int angka1 = input.nextInt();
        int angka2 = input.nextInt();

        int hasil = HitungPembagian(angka1, angka2);

        // Exception handling use block try-throw-catch
        try {
            if (angka2 == 0) {
                throw new ArithmeticException("Angka pembagi tidak boleh nol!");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        // Menampilkan hasil pembagian
        System.out.println("Hasil dari " + angka1 + " dibagi " + angka2 + " adalah: " + hasil);
    }

}
