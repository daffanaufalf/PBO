import java.io.*;

public class InputDariKeyboard {
    public static void main(String[] args) {

        String nim = "", nama = "";
        byte nilAbsen = 0, nilTugas = 0, nilUTS = 0, nilUAS = 0;

        BufferedReader objInput = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("============================================");
            System.out.println("\t\tInput Data Mahasiswa");
            System.out.println("============================================");
            System.out.print("NIM\t\t\t\t:\t");
            nim = objInput.readLine();
            System.out.print("Nama\t\t\t:\t");
            nama = objInput.readLine();
            System.out.print("Nilai Absen\t\t:\t");
            nilAbsen = Byte.parseByte(objInput.readLine());
            System.out.print("Nilai Tugas\t\t:\t");
            nilTugas = Byte.parseByte(objInput.readLine());
            System.out.print("Nilai UTS\t\t:\t");
            nilUTS = Byte.parseByte(objInput.readLine());
            System.out.print("Nilai UAS\t\t:\t");
            nilUAS = Byte.parseByte(objInput.readLine());
            System.out.println("============================================\n\n");
        } catch (Exception e) {
            System.out.println("Error " + e);
        }

        System.out.println("============================================");
        System.out.println("\t\tCetak Data Mahasiswa");
        System.out.println("============================================");
        System.out.println("NIM\t\t\t\t: " + nim);
        System.out.println("Nama\t\t\t: " + nama);
        System.out.println("Nilai Absen\t\t: " + nilAbsen);
        System.out.println("Nilai Tugas\t\t: " + nilTugas);
        System.out.println("Nilai UTS\t\t: " + nilUTS);
        System.out.println("Nilai UAS\t\t: " + nilUAS);
        System.out.println("============================================");
    }
}
