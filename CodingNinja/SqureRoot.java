package CodingNinja;

import java.util.Scanner;
import java.lang.Math;

public class SqureRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double s = Math.sqrt(n);

        System.out.println(Math.round(s));
        sc.close();
    }
    
}
