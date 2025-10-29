package jobsheet5;
import java.util.Scanner;
public class square23 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.print("masukkan nilai n:");
            int n = sc.nextInt();
            for (int iOuter = 1; iOuter <= n; iOuter++) {
                for (int iInner = 1; iInner <= n; iInner++) {
                    System.out.print("*");
                }
                System.out.println();
            }


            sc.close();
    }
}
