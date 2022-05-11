package CodingNinja;

import java.util.Scanner;

public class MeargSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int []array1 = new int[n];
        int []array2 = new int[m];

        for(int i = 0; i < n; i++){
            array1[i] = sc.nextInt();
        }

        for(int j = 0; j < m; j++){
            array2[j] = sc.nextInt();
        }

        int i = 0;
        int j = 0;
        int k = 0;
        int []array3 = new int[m + n];

        while(i < n && j < m){

            if(array1[i] <= array2[j]){
                array3[k++] = array1[i++];
            }

            else{
                array3[k++] = array2[j++];
            }
        }

        while(i < n){
            array3[k++] = array1[i++];
        }

        while(j < m){
            array3[k++] = array2[j++];
        }


        for(int it = 0; it < array3.length; it++){
            System.out.print(array3[it] + " ");
        }
        sc.close();
    }    
}
