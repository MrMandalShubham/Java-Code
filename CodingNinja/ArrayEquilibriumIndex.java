package CodingNinja;

import java.util.Scanner;

public class ArrayEquilibriumIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []array =  new int[n];

        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        sc.close();

        int left_sum = 0;
        int right_sum = 0;

        for(int i = 1; i < n; i++){
            right_sum += array[i];
        }

        for(int i = 1; i < n - 1; i++){
            left_sum += array[i - 1];
            right_sum -= array[i];
            if(left_sum == right_sum){
                System.out.println(i);
                return;
            }
            else{
                continue;
            }
        }
    }
}
