package CodingNinja;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        int t = sc.nextInt();
        for(int i = 0; i < t; i ++){
            int temp = array[0];
            for(int j = 0; j < n - 1; j++){
                array[j] = array[j + 1];
            }
            array[n - 1] = temp;
        }

        for(int i = 0; i < n; i++){
            System.out.print(array[i] +  " ");
        }
        sc.close();
    }
    
}
