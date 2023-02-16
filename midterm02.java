import java.util.Scanner;

public class midterm02 {
    static void distance(double p) {
        double d = 1 / p;
        System.out.println(d + " Persec");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double p = scan.nextDouble();
        distance(p);
    }
}
