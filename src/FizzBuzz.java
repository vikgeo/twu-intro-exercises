public class FizzBuzz {

    public static void printFizzBuzz(){
        for (int i = 1; i <= 100; i++) {
            boolean divBy3 = (i%3 == 0);
            boolean divBy5 = (i%5 == 0);
            if (divBy3 || divBy5) {
                if (divBy3){
                    System.out.print("Fizz");
                }
                if (divBy5){
                    System.out.print("Buzz");
                }
                System.out.println();
            } else {
                System.out.println(i);
            }
        }
    }
}
