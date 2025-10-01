package jobsheet5;

import java.util.Scanner; 

public class switchCetakKRS23 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        System.out.println("CETAK KRS SIAKAD");
        System.out.println("MASUKKAN SEMESTER SAAT INI");
        int SEMESTER = sc.nextInt();
        switch (SEMESTER) {
            case 1:
            System.err.println("krs semester 1 ditampilkan");
            break;
            case 2:
            System.out.println("krs semester 2 ditampilkan");
            break;
            case 3: 
            System.out.println("krs semester 3 ditampilkan");
            break;
            case 4:
            System.out.println("krs semester 4 ditampilkan");
            break;
            case 5:
            System.out.println("krs semester 5 ditampilkan");
            break;
            case 6:
            System.out.println("krs semester 6 ditampilkan");
            break;
            case 7:
            System.out.println("krs semester 7 ditampilkan");
            break;
            case 8:
            System.out.println("krs semester 8 ditampilkan");
            break;
            default:
            System.out.println("semester tidak valid");
            sc.close();
            



        }
    }
}
