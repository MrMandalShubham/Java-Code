package CodingNinja;
import java.util.Scanner;

public class AllPrime {
    public static void main(String[] args) {
        System.out.print("Enter Number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            int j;
            for(j = 2; j <= i; j++){
                if(i % j == 0){
                    break;
                }
            }
            if(j == i){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
