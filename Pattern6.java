class Pattern6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int k = 1;
            for (int j = 1; j <= 9; j++) {
                if (j <= 9) {
                    if (j % 2 != 0)
                        System.out.print(k);
                }
                k++;
            }
            System.out.println("");
        }
    }
}