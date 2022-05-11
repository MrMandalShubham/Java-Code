package CodingNinja;

import java.util.Scanner;

public class FeranhiteToCelcius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        int d = sc.nextInt();
        for(int i = s; i <= e; i += d){
            int celcius = (i - 32) * 5/9;
            System.out.println(i + " " + celcius);
        }
        sc.close();
    }
    
}
