 package jobsheet5;

 import java.util.Scanner;

 public class IfElsecetakKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("CETAK KRS SIAKAD");
        System.out.println("MASUKKAN SEMESTER SAAT INI");
        int SEMESTER = sc.nextInt();
        
        if (SEMESTER == 1) {
            System.out.println("krs semester 1 ditampilkan");
        } else if (SEMESTER == 2) {
            System.out.println("krs semester 2 ditampilkan");
        } else if (SEMESTER == 3) {
            System.out.println("krs semester 3 ditampilkan");
        } else if (SEMESTER == 4) {
            System.out.println("krs semester 4 ditampilkan");
        } else if (SEMESTER == 5) {
            System.out.println("krs semester 5 ditampilkan");
        } else if (SEMESTER == 6) {
            System.out.println("krs semester 6 ditampilkan");
        } else if (SEMESTER == 7) {
            System.out.println("krs semester 7 ditampilkan");
        } else if (SEMESTER == 8) {
            System.out.println("krs semester 8 ditampilkan");
        } else {
            System.out.println("semester tidak valid");
        }
        
        sc.close();
    }
    
}