package CodingNinja;

import java.util.Scanner;

public class HighestOccuringChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char Occue_char = ' ';
        int []occur_array = new int[26];


        for(int i = 0; i < str.length(); i++){
            int ele = str.charAt(i) - 'a';
            occur_array[ele] += 1;
        }

        int max = 0;
        for(int i = 0; i < 26; i++){
            int temp = occur_array[i];
            if(max < temp){
                max = temp;
                Occue_char = (char)('a' + i);
            }
        }
        System.out.println(Occue_char);
        sc.close();
    }
}
