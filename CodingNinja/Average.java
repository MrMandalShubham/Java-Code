package CodingNinja;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int x,y,z;
        Scanner sc = new Scanner(System.in);
        
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        sc.close();

        int result = (x + y + z)/3;

        System.out.println(result);
    }
}
