package CodingNinja;

import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String current_word = "";
        String result = "";
        String reverseword = "";
        sc.close();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                
                for(int j = 0; j < current_word.length(); j++){
    
                    reverseword = current_word.charAt(j) + reverseword;
                }

                current_word = "";
                result += reverseword + " ";
                reverseword = "";
            }
            else{
                current_word += str.charAt(i);
            }
        }

        for(int j = 0; j < current_word.length(); j++){
    
            reverseword = current_word.charAt(j) + reverseword;
        }

        result += reverseword + " ";

        System.out.println(result);

    }
}
