import java.util.Scanner;

public class Rectangle {
    private static Scanner sc;
    public static void main(String[] args) {

        int p,l, luas;
        sc = new Scanner(System.in);

        System.out.print("Masukkan panjang persegi: ");
        p = sc.nextInt();

        System.out.print("Masukkan lebar persegi: ");
        l = sc.nextInt();

        luas = p * l;

        System.out.println("Luas persegi = " + luas);

    }
}
