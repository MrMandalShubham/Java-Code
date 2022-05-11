package CodingNinja;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        int n = str.length();
        for(int i = 0; i < n; i++){
            if(str.charAt(i) != str.charAt(n - 1 - i)){
                System.out.println("Word is no Palindrome ");
                return;
            }
            else{
                continue;
            }
        }
        System.out.println("Word is Palindrome");
        return;
    }
}
