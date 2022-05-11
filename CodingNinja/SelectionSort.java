package CodingNinja;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []array = new int[n];
        for(int i = 0; i < n; i ++){
            array[i] = sc.nextInt();
        }
        // Selection sort section
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                else{
                    continue;
                }
            }
        }
        for(int i = 0; i < n; i ++){
            System.out.println(array[i]);
        }
        sc.close();
    }
    
}
