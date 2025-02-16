package Clases.src;

public class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzz(15);
    }

    public static void FizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            boolean f = i % 3 == 0;
            boolean b = i % 5 == 0;
            if (f && b) {
                System.out.println("FizzBuzz");
            } else if (f) {
                System.out.println("Fizz");
            } else if (b) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
