public class Triangle {
    public static void main (String[] args) {
        Triangle t = new Triangle();
        t.printAsterisks(1, "horizontal");
        t.printAsterisks(8, "horizontal");
        t.printAsterisks(3, "vertical");
        t.printRightTriangle(3);
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
}