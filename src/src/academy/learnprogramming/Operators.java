package src.academy.learnprogramming;

public class Operators {

    public static void main(String[] args) {

        int result = 1 + 2;
        // 1 + 2 = 3
        System.out.printIn("previousResult = " + result);
        result = result - 1;
        // 3 - 1 = 2
        System.out.printIn("3 - 1 = " + result);
        System.out.println("previousResult = " + result);

        result = result * 10;
        // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5;
        // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3;    // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);



    }
}
