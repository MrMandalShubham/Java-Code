package CodingNinja;

// Time Complexity this code is O(n^2)

import java.util.Scanner;

public class CheckPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        sc.close();

        for(int i = 0; i < str1.length(); i++){
            boolean status = false;
            for(int j = 0; j < str2.length(); j++){
                if(str1.charAt(i) == str2.charAt(j)){
                    status = true;
                }
            }
            if(status != true){
                System.out.println("no permutation ");
                return;
            }
            else{
                continue;
            }
        }
        System.out.println(" is pemutation ");
        return;
    }
}
