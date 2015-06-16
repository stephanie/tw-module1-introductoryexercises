public class Diamond {
    public static void main (String[] args) {
        Diamond d = new Diamond();
        d.printHalfDiamond(3);
    }

    void printHalfDiamond(int num) {
        for(int row = 0; row < num; row++) {
            StringBuilder rowString = new StringBuilder();
            int rowLength = 2 * num - 1;
            for (int space = 0; space < (num - 1 - row); space++) {
                rowString.append(" ");
            }
            for (int asterix = 0; asterix < (2 * row + 1); asterix++) {
                rowString.append("*");
            }
            System.out.println(rowString.toString());
        }
    }
}