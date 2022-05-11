package CodingNinja;

import java.util.Scanner;

public class FindMaxSubArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int current_sum = 0;
        int max_sum = 0;
        int pos = 0;
        for(int i = 0; i < n; i++)
        {
            current_sum += arr[i];
            if(i < k - 1){
                continue;
            }
            else{

                if(max_sum < current_sum){
                    max_sum = current_sum;
                }
                current_sum = current_sum - arr[pos];
                pos += 1;
            }
        }
        System.out.println(max_sum);
        sc.close();
    }
}
