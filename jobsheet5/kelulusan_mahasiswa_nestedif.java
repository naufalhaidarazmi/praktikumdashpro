 package jobsheet5;

 import java.util.Scanner;

public class kelulusan_mahasiswa_nestedif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== SISTEM PENENTUAN KELULUSAN SEMESTER ===");
        System.out.println("\nMasukkan nilai mata kuliah Algoritma dan Pemrograman:");
        System.out.print("Nilai UTS: ");
        double nilaiUtsAlgoritma = input.nextDouble();
        System.out.print("Nilai UAS: ");
        double nilaiUasAlgoritma = input.nextDouble();
        System.out.print("Nilai Tugas: ");
        double nilaiTugasAlgoritma = input.nextDouble();
        System.out.println("\nMasukkan nilai mata kuliah Struktur Data:");
        System.out.print("Nilai UTS: ");
        double nilaiUtsStrukturData = input.nextDouble();
        System.out.print("Nilai UAS: ");
        double nilaiUasStrukturData = input.nextDouble();
        System.out.print("Nilai Tugas: ");
        double nilaiTugasStrukturData = input.nextDouble();
        double nilaiAkhirAlgoritma = (nilaiUtsAlgoritma * 0.3) + (nilaiUasAlgoritma * 0.4) + (nilaiTugasAlgoritma * 0.3);
        double nilaiAkhirStrukturData = (nilaiUtsStrukturData * 0.3) + (nilaiUasStrukturData * 0.4) + (nilaiTugasStrukturData * 0.3);
        double rataRataNilaiAkhir = (nilaiAkhirAlgoritma + nilaiAkhirStrukturData) / 2;
        String statusAlgoritma;
        String statusStrukturData;

        if (nilaiAkhirAlgoritma >= 60) {
            statusAlgoritma = "LULUS";
        } else {
            statusAlgoritma = "TIDAK LULUS";
        }

        if (nilaiAkhirStrukturData >= 60) {
            statusStrukturData = "LULUS";
        } else {
            statusStrukturData = "TIDAK LULUS";
        }

        String statusSemester;
        if (nilaiAkhirAlgoritma >= 60 && nilaiAkhirStrukturData >= 60) {  
            if (rataRataNilaiAkhir >= 70) {  
                statusSemester = "LULUS SEMESTER";
            } else {
                statusSemester = "TIDAK LULUS SEMESTER (Rata-rata kurang dari 70)";
            }
        } else {  
            statusSemester = "TIDAK LULUS SEMESTER (Ada mata kuliah tidak lulus)";
        }

        System.out.println("\n=== HASIL PENILAIAN AKHIR ===");
        System.out.println("Nilai Akhir Algoritma dan Pemrograman : " + nilaiAkhirAlgoritma + " (" + statusAlgoritma + ")");
        System.out.println("Nilai Akhir Struktur Data              : " + nilaiAkhirStrukturData + " (" + statusStrukturData + ")");
        System.out.println("Rata-rata Nilai Akhir : " + rataRataNilaiAkhir);
        System.out.println("Status Kelulusan Semester : " + statusSemester);

        input.close();
    }
}
