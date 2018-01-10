import java.util.SimpleTimeZone;

public class Asterisk {
    public static void printAsterisk(){
        System.out.println("*");
    }

    public static void printSingleLine(int n){


        for (int i = 0; i < n; i++){
            System.out.print("*");
        }
    }

    public static void printMultipleLines(int n){


        for (int i = 0; i < n; i++){
            System.out.println("*");
        }
    }

    public static void printTriangle(int n) {
        for (int i = 1; i <= n; i++){
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }



}

