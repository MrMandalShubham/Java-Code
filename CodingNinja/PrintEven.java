package CodingNinja;
import java.util.Scanner;

public class PrintEven {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n <= 0 ){
            System.out.println( n  + " is not even number");
        }
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
            else{
                continue;
            }
        }
        sc.close();
    }
}
