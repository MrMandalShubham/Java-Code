package CodingNinja;

import java.util.Scanner;

public class FindTheUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int []arr = new int[n];

        int []feq = new int[2*n];

        // int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        for(int i = 0; i < n; i++){
            int ele = arr[i];
            feq[ele] += 1;
        }
        // int result = 0;
        for(int i = 0; i < 2*n; i++){
            if(feq[i] == 1){
                System.out.println(i);
                return;
            }
        }
        sc.close();
    }
}
