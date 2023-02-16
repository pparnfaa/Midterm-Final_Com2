import java.util.Scanner;

public class midterm01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String dna = scan.nextLine();
        int pos = scan.nextInt();
        String new_pep = scan.nextLine();
        if (pos - 1 <= dna.length() && pos > 0) {
            for (int i = 0; i < dna.length(); i++) {
                if (i == pos - 1) {
                    System.out.print(new_pep.charAt(1));
                } else {
                    System.out.print(dna.charAt(i));
                }
            }
            System.out.println("");
        } else {
            System.out.println("Invalid DNA");
        }
    }
}
