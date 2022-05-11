package CodingNinja;
import java.util.Scanner;

public class SumPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i <= n){
            int sum = 0;
            int j = 1;
            while(j <= i ){
                if(j == 1){
                    System.out.print(j);
                }
                else{
                    System.out.print(" + " + j);
                }
                sum += j;
                j ++;
            }
            System.out.println(" = " + sum);
            i ++;
        }
        sc.close();
    }
}
