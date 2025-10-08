package jobsheet5;

import java.util.Scanner;

public class kelulusanmahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== INPUT DATA MAHASISWA =====");
        System.out.print("Nama : ");
        String nama = sc.nextLine();
        System.out.print("NIM  : ");
        String nim = sc.nextLine();

        System.out.println("\n---- Mata Kuliah 1: Algoritma dan Pemrograman ----");
        System.out.print("Nilai UTS   : ");
        double utsAlgoritma = sc.nextDouble();
        System.out.print("Nilai UAS   : ");
        double uasAlgoritma = sc.nextDouble();
        System.out.print("Nilai Tugas : ");
        double tugasAlgoritma = sc.nextDouble();

        System.out.println("\n---- Mata Kuliah 2: Struktur Data ----");
        System.out.print("Nilai UTS   : ");
        double utsStruktur = sc.nextDouble();
        System.out.print("Nilai UAS   : ");
        double uasStruktur = sc.nextDouble();
        System.out.print("Nilai Tugas : ");
        double tugasStruktur = sc.nextDouble();

        double nilaiAkhirAlgoritma = (utsAlgoritma * 0.3) + (uasAlgoritma * 0.4) + (tugasAlgoritma * 0.3);
        double nilaiAkhirStruktur = (utsStruktur * 0.3) + (uasStruktur * 0.4) + (tugasStruktur * 0.3);

        String hurufAlgoritma, statusAlgoritma;
        if (nilaiAkhirAlgoritma >= 85) {
            hurufAlgoritma = "A";
            statusAlgoritma = "LULUS";
        } else if (nilaiAkhirAlgoritma >= 75) {
            hurufAlgoritma = "B+";
            statusAlgoritma = "LULUS";
        } else if (nilaiAkhirAlgoritma >= 70) {
            hurufAlgoritma = "B";
            statusAlgoritma = "LULUS";
        } else if (nilaiAkhirAlgoritma >= 65) {
            hurufAlgoritma = "C+";
            statusAlgoritma = "LULUS";
        } else if (nilaiAkhirAlgoritma >= 60) {
            hurufAlgoritma = "C";
            statusAlgoritma = "LULUS";
        } else if (nilaiAkhirAlgoritma >= 55) {
            hurufAlgoritma = "D";
            statusAlgoritma = "TIDAK LULUS";
        } else {
            hurufAlgoritma = "E";
            statusAlgoritma = "TIDAK LULUS";
        }

        String hurufStruktur, statusStruktur;
        if (nilaiAkhirStruktur >= 85) {
            hurufStruktur = "A";
            statusStruktur = "LULUS";
        } else if (nilaiAkhirStruktur >= 75) {
            hurufStruktur = "B+";
            statusStruktur = "LULUS";
        } else if (nilaiAkhirStruktur >= 70) {
            hurufStruktur = "B";
            statusStruktur = "LULUS";
        } else if (nilaiAkhirStruktur >= 65) {
            hurufStruktur = "C+";
            statusStruktur = "LULUS";
        } else if (nilaiAkhirStruktur >= 60) {
            hurufStruktur = "C";
            statusStruktur = "LULUS";
        } else if (nilaiAkhirStruktur >= 55) {
            hurufStruktur = "D";
            statusStruktur = "TIDAK LULUS";
        } else {
            hurufStruktur = "E";
            statusStruktur = "TIDAK LULUS";
        }

        double rataRata = (nilaiAkhirAlgoritma + nilaiAkhirStruktur) / 2;
        String statusSemester;
        if (statusAlgoritma.equals("LULUS") && statusStruktur.equals("LULUS")) {
            if (rataRata >= 70) {
                statusSemester = "LULUS";
            } else {
                statusSemester = "TIDAK LULUS (Rata-rata < 70)";
            }
        } else {
            statusSemester = "TIDAK LULUS (Salah satu MK tidak lulus)";
        }

        System.out.println("\n================= HASIL PENILAIAN AKADEMIK =================");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println("-------------------------------------------------------------");
        System.out.println("Mata Kuliah\t\tUTS\tUAS\tTugas\tNilai Akhir\tNilai Huruf\tStatus");
        System.out.println("-------------------------------------------------------------");
        System.out.printf("Algoritma Pemrograman\t%.0f\t%.0f\t%.0f\t%.2f\t\t%s\t\t%s\n",
                utsAlgoritma, uasAlgoritma, tugasAlgoritma, nilaiAkhirAlgoritma, hurufAlgoritma, statusAlgoritma);
        System.out.printf("Struktur Data\t\t%.0f\t%.0f\t%.0f\t%.2f\t\t%s\t\t%s\n",
                utsStruktur, uasStruktur, tugasStruktur, nilaiAkhirStruktur, hurufStruktur, statusStruktur);
        System.out.println("-------------------------------------------------------------");
        System.out.printf("Rata-rata Nilai Akhir: %.2f\n", rataRata);
        System.out.println("Status Semester : " + statusSemester);

        sc.close();
    }
}
