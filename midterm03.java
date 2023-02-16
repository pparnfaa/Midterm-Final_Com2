import java.util.Scanner;

public class midterm03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();
        int arr[][] = new int[r + 1][c + 1];
        for (int i = 1; i < r + 1; i++) {
            for (int j = 1; j < c + 1; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        int tang = scan.nextInt();
        int norn = scan.nextInt();
        if (tang == 1 && norn == 0) {
            for (int i = r; i > 0; i--) {
                for (int j = 1; j < c + 1; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println("");
            }
        } else if (tang == 0 && norn == 1) {
            for (int i = 1; i < r + 1; i++) {
                for (int j = c; j > 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println("");
            }
        } else if (tang == 1 && norn == 1) {
            for (int i = 1; i < r + 1; i++) {
                for (int j = 1; j < c + 1; j++) {
                    System.out.print(arr[j][i] + " ");
                }
                System.out.println("");
            }
        }
    }
}
