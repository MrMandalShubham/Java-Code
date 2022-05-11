package CodingNinja;

import java.util.Scanner;

public class PushZeroEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []array = new int[n];
        int count = 0;

        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        for(int i = 0; i < n - 1; i++){
            if(array[i] != 0){
                array[count++] = array[i];
            }
        }

        for(int i = count; i < n; i++){
            array[i] = 0;
        }

        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
        sc.close();
    }
    
}
