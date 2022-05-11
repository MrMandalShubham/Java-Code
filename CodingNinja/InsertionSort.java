package CodingNinja;

import java.util.Scanner;

public class InsertionSort{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            int ele = array[i];
            int j;
            for(j = i - 1; j >= 0 && array[j] > ele; j--){

                array[j + 1] = array[j];
            }

            array[j + 1] = ele;
        }
        for(int i = 0; i < n; i++){
            System.out.println(array[i]);
        }
        sc.close();
    }
}
