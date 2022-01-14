import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int count = sc.nextInt();
        int k = count;
        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= count; j++) {
                if (j <= count - i) {
                    System.out.print(k);
                } else
                    System.out.print(" ");
            }
            k--;
            System.out.println("");
        }
    }
}
