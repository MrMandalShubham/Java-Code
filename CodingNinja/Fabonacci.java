package CodingNinja;
import java.util.Scanner;

public class Fabonacci {

    public static int fabonacci(int x){
        if(x == 1 || x == 2){
            return 1;
        }
        else{
            return fabonacci(x - 1) + fabonacci(x - 2);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i ++){
            System.out.println(fabonacci(i));
        }
        sc.close();
    }
}
