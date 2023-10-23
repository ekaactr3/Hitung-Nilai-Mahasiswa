import java.util.Scanner;

public class HitungNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama kamu: ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM kamu: ");
        int nim = input.nextInt();

        System.out.print("Masukkan nilai Tubes kamu: ");
        double tuBes = input.nextDouble();

        System.out.print("Masukkan nilai Quiz kamu: ");
        double Quiz = input.nextDouble();

        System.out.print("Masukkan nilai Tugas kamu: ");
        double Tugas = input.nextDouble();

        System.out.print("Masukkan nilai UTS kamu: ");
        double UTS = input.nextDouble();

        System.out.print("Masukkan nilai UAS kamu: ");
        double UAS = input.nextDouble();

        double total_nilai = (0.3 * tuBes) + (0.1 * Quiz) + (0.1 * Tugas) + (0.25 * UTS) + (0.25 * UAS);

        System.out.println("\nNama : "+ nama);
        System.out.println("NIM : "+ nim);
        System.out.println("Nilai Matakuliah Pemrograman Berorientasi Objek: "+ total_nilai);

        input.close();
    }
}
