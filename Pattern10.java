import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int count = sc.nextInt();
        int k;
        for (int i = 1; i <= count; i++) {
            // if (i % 2 == 0)
            // k = 2;
            // else
            // k = 1;
            for (int j = 1; j <= count; j++) {
                if (j <= i) {
                    if (j % 2 == 0)
                        k = 2;
                    else
                        k = 1;

                    System.out.print(k);

                } else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
