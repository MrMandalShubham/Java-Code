package CodingNinja;

import java.util.Scanner;

public class ChakeArrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        if(n == 0 || n == 1){
            System.out.println(0);
        }

        int min = Integer.MAX_VALUE;
        int pos = 0;
        for(int i = 0; i < n; i++){
            if(array[i] < min){
                min = array[i];
                pos = i;
            }
        }
        System.out.println(pos);
        sc.close();
    }
}
