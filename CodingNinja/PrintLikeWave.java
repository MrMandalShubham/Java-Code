package CodingNinja;

import java.util.Scanner;

public class PrintLikeWave {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][]array = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                array[i][j] = sc.nextInt();
            }
        }

        for(int j = 0; j < m; j++){
            for(int i = 0; i < n; i++){
                if(j % 2 == 0){
                    System.out.print(array[i][j] + " ");
                }
                else{
                    System.out.print(array[n - 1 - i][j] + " ");
                }
            }
        }
        sc.close();
        return;
    }
}
