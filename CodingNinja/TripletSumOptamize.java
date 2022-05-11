package CodingNinja;
import java.util.Arrays;
import java.util.Scanner;

public class TripletSumOptamize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int num = sc.nextInt();

        Arrays.sort(arr);
        
        int numTriplets = 0;
        
        for (int i=0; i<n; i++) {
            int pairSum = num - arr[i];
            int numPairs = 0;
            
            int start = i + 1;
            int stop = n - 1;
             
             while (start < stop) {
                if (arr[start] + arr[stop] < pairSum) {
                    start++;
                } else if (arr[start] + arr[stop] > pairSum) {
                    stop--;
                } else {
                   if (arr[start] == arr[stop]) {
                       int totalCount = (stop - start) + 1;
                       numPairs += (totalCount * (totalCount - 1) / 2);
                       break;
                   }
                    
                    int tempI = start + 1;
                    int tempJ = stop - 1;
                    
                    while (tempI <= tempJ && arr[start] == arr[tempI]) {
                        tempI++;
                    }
                    
                    while (tempI <= tempJ && arr[stop] == arr[tempJ]) {
                        tempJ--;
                    }
                    
                    int totalElementFromStart = (tempI - start);
                    int totalElementFromEnd = stop - tempJ;
                    
              numPairs += (totalElementFromStart * totalElementFromEnd);
                    
                    start = tempI;
                    stop = tempJ;
                }
            }
            numTriplets += numPairs;
        }
        System.out.println(numTriplets);
        sc.close();
        return;
    }    
}