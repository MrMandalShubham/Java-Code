package CodingNinja;

import java.util.Scanner;

public class ReverseStringWordwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String currentword = "";
        String result = "";
        int i = 0;
        sc.close();

        for(; i < str.length(); i++){

            if(str.charAt(i) == ' '){
                result = currentword + " " + result;
                currentword = "";
            }
            else{
                currentword += str.charAt(i);
            }
        }

        result = currentword + " " + result;

        System.out.print(result);
    }
}
