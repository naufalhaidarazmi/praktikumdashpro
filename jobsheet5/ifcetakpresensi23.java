package jobsheet5;

import java.util.Scanner; 

public class ifcetakpresensi23 {     
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 
        System.out.println("----CETAK KRS SIAKAD----");
        System.out.println("APAKAH UKT SUDAH LUNAS? (TRUE/FALSE)");
        boolean uktlunas = sc.nextBoolean();

        if (uktlunas) {
            System.out.println("PEMBAYARAN UKT TELAH TERVERIFIKASI");
            System.out.println("SYSTEM CETAK KRS MINTA TANDA TANGAN");
        } else {
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu.");
        }

        String hasil = (uktlunas) ? "PEMBAYARAN UKT TELAH TERVERIFIKASI\nSYSTEM CETAK KRS MINTA TANDA TANGAN": "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu.";
        System.out.println("\n[Versi Ternary Operator]");
        System.out.println(hasil);

        sc.close();
    }
}
