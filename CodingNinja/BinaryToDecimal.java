package CodingNinja;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int decimal = 0;
        int multi = 1;
        while(n > 0){
            int reminder = n % 10;
            decimal += reminder * multi;
            multi *= 2;
            n /= 10;
        }
        System.out.println(decimal);
        sc.close();
    }
}
