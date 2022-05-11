package CodingNinja;

import java.util.Scanner;

public class Sort012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        int count0 = 0;
        int count1 = 0;
        // int count2 = 0;

        for(int i = 0; i < n; i++){
            if(array[i] == 0){
                count0 += 1;
            }
            else if(array[i] == 1){
                count1 += 1;
            }
        }

        for(int i = 0; i < n; i++){
            if(i < count0){
                array[i] = 0;
            }
            else if(i < count0 + count1){
                array[i] = 1;
            }
            else{
                array[i] = 2;
            }
        }

        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
        sc.close();
    }
}
