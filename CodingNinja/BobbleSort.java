package CodingNinja;

import java.util.Scanner;

public class BobbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j ++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                else{
                    continue;
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.println(array[i]);
        }
        sc.close();
    }
    
}
