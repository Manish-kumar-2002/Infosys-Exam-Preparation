import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int count = sc.nextInt();
        for (int i = 1; i <= count; i++) {
            int k = 1;
            for (int j = 1; j <= count; j++) {
                if (j <= i) {
                    System.out.print(k);
                    k++;
                } else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
