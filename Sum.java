import java.util.Scanner;

class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many Number to Sum...");
        int count = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}