package CodingNinja;

public class GeometricSum {

    public static double geometricSum(int k){
        double result = 1.00000;
        if(k <= 0){
            return 0;
        }
        double x = Math.pow(2, k);
        result = (1/x) + geometricSum(k - 1);
        return result;
    }

    public static double Sum(int k){
        return (1 + geometricSum(k));
    }

    public static void main(String[] args) {
        int k = 3;
        double result = Sum(k);
        System.out.println(result);
        return;
    }
}
