package CodingNinja;

import java.util.Scanner;

public class SecondLargestEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int []array = new int[n];

        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        sc.close();

        int largest = -2147483648;
        int second_largest = -2147483648;

        if(n == 0 || n == 1){
            System.out.println(second_largest);
            return;
        }

        for(int i = 0; i < n; i++){
            if(largest < array[i]){
                largest = array[i];
            }
            if(second_largest < array[i] && array[i] < largest){
                second_largest = array[i];
            }
        }
        // if(largest == second_largest){
        //     return;
        // }
        
        System.out.println(second_largest);
        // System.out.println(largest);
        sc.close();
    }
    
}
