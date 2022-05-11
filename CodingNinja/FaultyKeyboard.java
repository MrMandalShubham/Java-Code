package CodingNinja;

import java.util.Scanner;

public class FaultyKeyboard {

    public static boolean Check_String(String str1, String str2){
        int len1 = str1.length();
        int len2 = str2.length();

        int i = 0;
        int j = 0;
        int Pre = str1.charAt(0);
        while(i < len1 && j < len2){
            int temp1 = str1.charAt(i);
            int temp2 = str2.charAt(j);
            
            if(temp1 != temp2){
                if(temp2 == Pre){
                    j += 1;
                    continue;
                }
                else{
                    return false;
                }
            }
            else{
                Pre = str1.charAt(i);
                i += 1;
                j += 1;
            }
        }
        while(j < len2){
            int temp = str2.charAt(j);
            if(temp != Pre){
                return false;
            }
            else{
                j++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        int n = sc.nextInt();
        String str1;
        String str2;

        for(int i = 0; i < n; i++){
            str1 = s.nextLine();
            str2 = s.nextLine();

            boolean result = Check_String(str1, str2);
            System.out.println(result);
        }
    }
}
