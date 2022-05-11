package CodingNinja;
import java.util.Scanner;

public class FindCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int x = c;
        if(x >= 65 && x <= 90){
            System.out.println(1);
        }
        else if(x >= 97 && x <= 122){
            System.out.println(0);
        }
        else{
            System.out.println(-1);
        }
        sc.close();
    }
}
