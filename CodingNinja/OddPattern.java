package CodingNinja;

import java.util.Scanner;

public class OddPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i <= n){
            int j1 = 1;
            int p1 = i*2 - 1;
            while(j1 <= n - i + 1){
                System.out.print(p1);
                p1 += 2;
                j1 += 1;
            }
            int j2 = 1;
            int p2 = 1;
            while(j2 <= i - 1){
                System.out.print(p2);
                p2 += 2;
                j2 += 1;
            }
            System.out.println();
            i += 1;
        }
        sc.close();
    }
}
