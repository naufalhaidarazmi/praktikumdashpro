package jobsheet5;

import java.util.Scanner;

public class kelulusanmahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PENENTUAN KELULUSAN PER MATA KULIAH ===");

        System.out.print("Masukkan nilai UTS: ");
        double uts = input.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        double uas = input.nextDouble();
        System.out.print("Masukkan nilai Tugas: ");
        double tugas = input.nextDouble();

        double nilaiAkhir = (uts * 0.3) + (uas * 0.4) + (tugas * 0.3);

        String grade;
        if (nilaiAkhir >= 85) {
            grade = "A";
        } else if (nilaiAkhir >= 75) {
            grade = "B";
        } else if (nilaiAkhir >= 65) {
            grade = "C";
        } else if (nilaiAkhir >= 55) {
            grade = "D";
        } else {
            grade = "E";
        }

        String status;
        if (nilaiAkhir >= 60) {
            status = "LULUS";
        } else {
            status = "TIDAK LULUS";
        }

        System.out.println("\n=== HASIL PENILAIAN ===");
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Nilai Huruf : " + grade);
        System.out.println("Status      : " + status);

        input.close();
    }
}
