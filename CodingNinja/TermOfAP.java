package CodingNinja;

import java.util.Scanner;

public class TermOfAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        for(int i = 1; count <= n; i++){
            int A = 3 * i + 2;
            if(A % 4 != 0){
                System.out.print(A + " ");
                count += 1;
            }
            else{
                continue;
            }
        }
        sc.close();
    }
}
