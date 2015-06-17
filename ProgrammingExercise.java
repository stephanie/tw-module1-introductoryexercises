import java.util.ArrayList;

public class ProgrammingExercise {
    public static void main (String[] args) {
        ProgrammingExercise p = new ProgrammingExercise();
        p.printAsterisks(1, "horizontal");
        p.printAsterisks(8, "horizontal");
        p.printAsterisks(3, "vertical");
        p.printRightTriangle(3);
        p.printDiamond(3, "half", "");
        p.printDiamond(3, "full", "");
        p.printDiamond(3, "full", "Stephanie");
        p.fizzBuzz();
        p.generate(30);
    }

    void printAsterisks(int num, String orientation) {
        for(int x = 0; x < num; x++) {
            if (x == (num-1) || orientation.equals("vertical")) {
                System.out.println("*");
            } else {
                System.out.print("*");
            }

        }
    }

    void printRightTriangle(int num) {
        StringBuilder sb = new StringBuilder();
        for(int x = 0; x < num; x++) {
            sb.append("*");
            System.out.println(sb.toString());
        }
    }

    void printDiamond(int num, String type, String name) {
        int rowLength = 2 * num - 1;

        for(int topRows = 0; topRows < (num - 1); topRows++) {
            StringBuilder rowString = new StringBuilder();
            for (int space = 0; space < (num - 1 - topRows); space++) {
                rowString.append(" ");
            }
            for (int asterix = 0; asterix < (2 * topRows + 1); asterix++) {
                rowString.append("*");
            }
            System.out.println(rowString.toString());
        }

        for(int centerRow = (num - 1); centerRow < num; centerRow++) {
            StringBuilder rowString = new StringBuilder();
            if ("".equals(name)) {
                for (int asterix = 0; asterix < (2 * centerRow + 1); asterix++) {
                    rowString.append("*");
                }
            } else {
                rowString.append(name);
            }
            System.out.println(rowString.toString());
        }

        if (type.equals("full")) {
            for(int bottomRows = (num - 2); bottomRows >= 0; bottomRows--) {
                StringBuilder rowString = new StringBuilder();
                for (int space = 0; space < (num - 1 - bottomRows); space++) {
                    rowString.append(" ");
                }
                for (int asterix = 0; asterix < (2 * bottomRows + 1); asterix++) {
                    rowString.append("*");
                }
                System.out.println(rowString.toString());
            } 
        }
    }

    void fizzBuzz() {
        for(int x = 1; x <= 100; x++) {
            if ( (x%3 == 0) && (x%5 == 0)) {
                System.out.println("FizzBuzz");
            } else if (x%3 == 0) {
                System.out.println("Fizz");
            } else if (x%5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(x);
            }
        }
    }

    void generate(int num) {
        ArrayList<Integer> primeFactors = new ArrayList<Integer>();
        for (int x = 2; x <= num; x++) {
            if (num % x == 0) {
                primeFactors.add(x);
                num /= x;
                x--;
            }
        }
        System.out.println(primeFactors);
    }
}