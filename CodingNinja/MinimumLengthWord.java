package CodingNinja;

import java.util.Scanner;

public class MinimumLengthWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String curr_str = "";
        String min_str = "";
        int min_len = Integer.MAX_VALUE;
        int len = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                len = curr_str.length();
                if(len < min_len){
                    min_len = len;
                    min_str = curr_str;
                    curr_str = "";
                }
                else{
                    curr_str = "";
                }
            }
            else{
                curr_str += str.charAt(i);
            }
        }
        len = curr_str.length();
        if(len < min_len){
            min_len = len;
            min_str = curr_str;
        }

        System.out.println(min_str);
        sc.close();
    }
}
