package CodingNinja;

import java.util.Scanner;

public class Array2DBondityAndDigonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][]array = new int[n][n];
        for(int i  = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                array[i][j] = sc.nextInt();
            }
        }

        int total_sum = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 || j == 0 || i == n - 1 || j == n - 1){
                    total_sum += array[i][j];
                }
                else if(i == j || j == n - i - 1){
                    total_sum += array[i][j];
                }
            }
        }
        System.out.println(total_sum);
        sc.close();
        return;
    }
}
