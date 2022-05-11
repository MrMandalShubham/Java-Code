package CodingNinja;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        int t = sc.nextInt();

        int s = 0;
        int l = n - 1;
        int result = -1;
        while(s <= l){
            int mid = (s + l)/2;
            if(array[mid] == t){
                result = mid;
                break;
            }
            else if(array[mid] < t){
                s = mid + 1;
            }
            else{
                l = mid - 1;
            }
        }
        System.out.println(result);
        sc.close();
    }    
}
