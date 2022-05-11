package CodingNinja;
import java.util.Scanner;

public class ValideTrangal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y,z;

        System.out.println("Enter Tangel side value");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        if(x + y > z){
            System.out.println("Tangal is valid");
        }
        else{
            System.out.println("Trangel is not valid");
        }

        sc.close();
    }
}
