package CodingNinja;

import java.util.Scanner;

public class ReversOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int revers = 0;
        int reminder = 0;
        while(n != 0){
            reminder = n%10;
            revers = revers * 10 + reminder;
            n = n/10;
        }

        System.out.println(revers);
        sc.close();
    }
}
