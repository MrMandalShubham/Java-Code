package CodingNinja;
import java.util.Scanner;

public class FindGCD {

    public static int GCD(int x, int y){
        if(x == 0 || y == 0){
            return 0;
        }
        else if(x == y){
            return x;
        }
        else if(x > y){
            return GCD(x - y, y);
        }
        else{
            return GCD(x, y - x);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter numbers");

        int x = sc.nextInt();
        int y = sc.nextInt();

        int result = GCD(x, y);

        System.out.println("GCD is " + result);
        sc.close();
    }
}
