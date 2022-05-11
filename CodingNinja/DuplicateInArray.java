package CodingNinja;

import java.util.Scanner;

public class DuplicateInArray {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        int []duplicate = new int[n - 1];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        for(int i = 0; i < n; i++){
            int ele = arr[i];
            duplicate[ele] += 1;
        }

        for(int i  = 0; i < n; i++){
            if(duplicate[i] > 1){
                System.out.println(i);
                return;
            }
            else{
                continue;
            }
        }
        System.out.println(-1);
        return;
    }
}
