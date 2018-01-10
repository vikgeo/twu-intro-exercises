public class Diamond {

    public static void printIsoscelesTriangle(int n) {
        int stars = 1;
        for (int i = n-1; i >= 0; i--) {
            printChar(i, " ");
            printChar(stars, "*");
            System.out.println();
            stars += 2;
        }

    }

    public static void printDiamond(int n) {
        int stars = 1;
        for (int i = n-1; i >= 0; i--) {
            printChar(i, " ");
            printChar(stars, "*");
            System.out.println();
            stars += 2;
        }
        stars = 2*n - 3;

        for (int j = 1; j < n ; j++) {

            printChar(j, " ");
            printChar(stars, "*");
            System.out.println();
            stars -= 2;
        }

    }

    public static void printDiamondName(int n) {
        int stars = 1;
        for (int i = n-1; i >= 1; i--) {
            printChar(i, " ");
            printChar(stars, "*");
            System.out.println();
            stars += 2;
        }
        System.out.println("Bill");

        stars = 2*n - 3;

        for (int j = 1; j < n ; j++) {

            printChar(j, " ");
            printChar(stars, "*");
            System.out.println();
            stars -= 2;
        }

    }


    private static void printChar(int n, String ch) {
        for (int i = 1; i <= n; i++) {
           System.out.print(ch);
    }

}








}
