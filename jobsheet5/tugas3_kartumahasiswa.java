package jobsheet5;

import java.util.Scanner;

public class tugas3_kartumahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Apakah mahasiswa membawa kartu mahasiswa? (true/false): ");
        boolean kartu = sc.nextBoolean();
        System.out.print("Apakah mahasiswa sudah registrasi online? (true/false): ");
        boolean registrasi = sc.nextBoolean();
        if (kartu || registrasi) {
            System.out.println("Boleh masuk perpustakaan.");
        } else {
            System.out.println("Ditolak masuk perpustakaan.");
        }
        sc.close();
    }
}
