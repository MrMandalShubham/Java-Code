package CodingNinja;

import java.util.Scanner;

public class HalfDimonPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        while(i <= n){
            System.out.print('*');
            int j1 = 1;
            while(j1 <= i){
                System.out.print(j1);
                j1 += 1;
            }
            
            int j2 = i - 1;
            while(j2 >= 1){
                System.out.print(j2);
                j2 -= 1;
            }
            if(j1 > 1){
                System.out.print('*');
            }
            System.out.println();
            i += 1;
        }
        int i2 = 1;
        while(i2 <= n - 1){
            System.out.print('*');
            int j1 = 1;
            while(j1 <= n - i2){
                System.out.print(j1);
                j1 += 1;
            }
            int j2 = n - 1 - i2;
            while(j2 >= 1){
                System.out.print(j2);
                j2 -= 1;
            }
            if(j1 > 1){
                System.out.print('*');
            }
            System.out.println();
            i2 += 1;
        }
        sc.close();
    }
}
