import java.util.Scanner;

public class uts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== PROGRAM PENERIMAAN TARUNA ===");
        System.out.print("Masukkan jenis kelamin (Laki-laki/Perempuan): ");
        String jenisKelamin = sc.nextLine();
        System.out.print("Masukkan tinggi badan (cm): ");
        double tinggi = sc.nextDouble();

        boolean diterima = false;

        if (jenisKelamin.equalsIgnoreCase("Laki-laki") && tinggi > 165) {
            diterima = true;
        } else if (jenisKelamin.equalsIgnoreCase("Perempuan") && tinggi > 160) {
            diterima = true;
        }

        System.out.println("\n=== HASIL SELEKSI ===");
        if (diterima) {
            System.out.println("Selamat! Anda DITERIMA sebagai taruna.");
        } else {
            System.out.println("Maaf, Anda TIDAK DITERIMA.");
        }

        sc.close();
    }
}
