package CodingNinja;

// This program take time complexity is O(nlogn)

import java.util.Scanner;

public class CheckPermutaionOptimize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int len1 = str1.length();
        int len2 = str2.length();
        sc.close();

        int []char_value = new int[100];
        for(int i = 0; i < len2; i++){
            int value = str2.charAt(i) - 32;

            char_value[value] += 1;
        }

        for(int i = 0; i < len1; i++){
            int value = str1.charAt(i) - 32;

            if(char_value[value] == 0){
                System.out.println("String is no Permutation");
                return;
            }
            else{
                char_value[value] -= 1;
            }
        }

        System.out.println("String is Premutation");
        return;
    }
}