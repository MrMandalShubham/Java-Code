package CodingNinja;

import java.util.Scanner;

public class SumorProducts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        // sc.close();
        int result;

        if(c == 1){
            result = 0;
            for(int i = 1; i <= n; i++){
                result += i;
            }
        }
        else if(c == 2){
            result = 1;
            for(int i = 1; i <= n; i++){
                result *= i;
            }
        }
        else{
            result = -1;
        }
        System.out.println(result);
        sc.close();
    }
}
