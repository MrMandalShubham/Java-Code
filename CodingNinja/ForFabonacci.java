package CodingNinja;

import java.util.Scanner;

public class ForFabonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prev = 0;
        int now = 0;
        int fabo = 1;
        for(int i = 1; i <= n; i++){

            if(i == 1 || i == 2){
                fabo = 1;
            }
            else{
                fabo = now + prev;
            }
            prev = now;
            now = fabo;
            System.out.println(fabo);
        }
        sc.close();
    }
}
