package CodingNinja;
import java.util.Scanner;

public class FindProduct {
   public static void main(String[] args) {
       System.out.println("Enter two number to get its product");
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       int y = sc.nextInt();

       int result = x * y;

       System.out.println(result);
       sc.close();
   } 
}
