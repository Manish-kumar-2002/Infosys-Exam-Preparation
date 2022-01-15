import java.util.Scanner;
import java.lang.Math;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int numdup = num;
        int temp = num, n = 0;
        int sum = 0;
        while (num > 0) {
            n++;
            num = num / 10;

        }
        while (temp > 0) {
            int r = temp % 10;
            sum = (int) (sum + Math.pow(r, n));
            temp = temp / 10;
        }
        if (numdup == sum)
            System.out.println("This is a Armstrong Number");
        else
            System.out.println("This not is a Armstrong Number");
    }
}
