package CodingNinja;
import java.util.Scanner;

public class TotalSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextInt();
        char gread = sc.next().charAt(0);
        double har = (salary / 100) * 20;
        double da = (salary / 100) * 50;
        double pf = (salary / 100) * 11;
        double allow = 0;

        if(gread == 'A'){
            allow = 1700;
        }
        else if(gread == 'B'){
            allow = 1500;
        }
        else{
            allow = 1300;
        }

        double totalsalary = salary + har + da + allow - pf;
        int result = (int)Math.round(totalsalary);

        System.out.println(result);
        System.out.println(totalsalary);

        sc.close();
    }
}
