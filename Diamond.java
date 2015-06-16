public class Diamond {
    public static void main (String[] args) {
        Diamond d = new Diamond();
        d.printDiamond(3, "half", "");
        d.printDiamond(3, "full", "");
        d.printDiamond(3, "full", "Stephanie");
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
}