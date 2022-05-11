package CodingNinja;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []Array = new int[5];
        for(int i = 0; i <= 4; i++){
            Array[i] = sc.nextInt();
        }

        for(int i = 0; i <= 4; i++){
            System.out.print(Array[i]);
        }
        sc.close();
    }
}
