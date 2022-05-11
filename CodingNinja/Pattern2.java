package CodingNinja;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<= n; i++){
            for(int j = 1; j<= n - i + 1; j++){
                System.out.print(j);
            }
            for(int s = i - 1; s >= 1; s--){
                System.out.print("*");
            }
            for(int s2 = 1; s2 <= i - 1; s2++){
                System.out.print("*");
            }
            for(int j2 = n - i + 1; j2 >= 1; j2--){
                System.out.print(j2);
            }
            System.out.println();
        }
        sc.close();
    }
    
}
