package CodingNinja;

import java.util.Scanner;


public class ArrayaIntersection {

    public static void merge(int []array, int l, int m, int r){
        int len1 = m - l + 1;
        int len2 = r - m;

        int []templ = new int[len1];
        int []tempr = new int[len2];

        // Sparate two array

        for(int i = 0; i < len1; i++){
            templ[i] = array[l + i];
        }
        for(int j = 0; j < len2; j++){
            tempr[j] = array[m + 1 + j];
        }

        // Merge array

        int i = 0;
        int j = 0;
        int k = l;
        while(i < len1 && j < len2){
            if(templ[i] <= tempr[j]){
                array[k++] = templ[i++];
                // i++;
            }
            else{
                array[k++] = tempr[j++];
                // j++;
            }
        }

        while(i < len1){
            array[k++] = templ[i++];
        }

        while(j < len2){
            array[k++] = tempr[j++];
        }

        return;
    }

    public static void print(int array[]){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        return;
    }

    public static void sort(int []array, int l, int r){
        if(l < r){
            int m = l + (r - l)/2;

            // Divide array in single Element
            sort(array, l, m);
            sort(array, m + 1, r);

            // Conqurer Element
            merge(array, l, m, r);

        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array Size
        int n = sc.nextInt();
        int m = sc.nextInt();

        // Difine Array
        int []arr1 = new int[n];
        int []arr2 = new int[m];

        for(int i = 0; i < n; i++){
            arr1[i] = sc.nextInt();
        }

        for(int j = 0; j < m; j++){
            arr2[j] = sc.nextInt();
        }

        sort(arr1, 0, n - 1);
        sort(arr2, 0, m - 1);

        int i = 0;
        int j = 0;
        while(i < n && j < m){
            if(arr1[i] == arr2[j]){
                System.out.print(arr1[i]  + " ");
                i++;
                j++;
            }
            else if(arr1[i] > arr2[j]){
                j++;
            }
            else{
                i++;
            }
        }
        sc.close();
        return;
    }
}
