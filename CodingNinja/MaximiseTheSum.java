package CodingNinja;

import java.util.Scanner;

public class MaximiseTheSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int []arr1 = new int[m];
        for(int i = 0; i < m; i++){
            arr1[i] = sc.nextInt();
        }

        int n = sc.nextInt();
        int []arr2 = new int[n];
        for(int i = 0; i < n; i++){
            arr2[i] = sc.nextInt();
        }

        int i = 0;
        int j = 0;
        int curr_sum1 = 0;
        int curr_sum2 = 0;
        int res_sum = 0;
        while(i < m && j < n){

            if(arr1[i] != arr2[j]){

                if(arr1[i] < arr2[j]){
                    curr_sum1 += arr1[i];
                    i++;
                }
                else{
                    curr_sum2 += arr2[j];
                    j++;
                }
            }

            else{
                curr_sum1 += arr1[i];
                curr_sum2 += arr2[j];
                if(curr_sum1 < curr_sum2){
                    res_sum += curr_sum2;
                }
                else{
                    res_sum += curr_sum1;
                }
                curr_sum1 = 0;
                curr_sum2 = 0;
                i++;
                j++;
            }
        }

        while(i < m){
            curr_sum1 += arr1[i];
            i++;
        }
        while(j < n){
            curr_sum2 += arr2[j];
            j++;
        }

        if(curr_sum1 < curr_sum2){
            res_sum += curr_sum2;
        }
        else{
            res_sum += curr_sum1;
        }

        System.out.println(res_sum);
        sc.close();

    }
}
