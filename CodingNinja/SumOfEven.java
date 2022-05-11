package CodingNinja;
import java.util.Scanner;

public class SumOfEven {
    public static void main(String[] args) {
        System.out.println(" Sum Of Even is");
        System.out.println(" Enter range of number");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        if(n <= 0){
            System.out.println(n + " Sum is 0");
        }
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                sum += i;
            }
            else{
                continue;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
