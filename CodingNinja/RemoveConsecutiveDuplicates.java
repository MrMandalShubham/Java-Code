package CodingNinja;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char current_char = ' ';
        String result = "";

        for(int i = 0; i < str.length(); i++){
            if(current_char == str.charAt(i)){
                continue;
            }
            else{
                result += str.charAt(i);
                current_char = str.charAt(i);
            }
        }
        System.out.println(result);
        sc.close();
    }
}
