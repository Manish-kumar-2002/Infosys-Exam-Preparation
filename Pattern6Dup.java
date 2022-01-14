import java.util.Scanner;

public class Pattern6Dup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 1; i <= count; i++) {
            int k = 1;
            for (int j = 1; j <= count; j++) {
                if (j <= count) {
                    if (j % 2 != 0)
                        System.out.print(k);
                }
                k++;
            }
            System.out.println("");
        }
    }
}
