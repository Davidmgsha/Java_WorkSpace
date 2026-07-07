package session2.exercise1;
public class AsterisksDiamond {

    public static void printDiamond(int size) {

        // Top half
        for (int row = 1; row <= size; row++) {

            for (int space = 1; space <= size - row; space++) {
                System.out.print(" ");
            }

            if (row == 1) {
                System.out.print("*");
            } else {
                System.out.print("*");

                for (int space = 1; space <= 2 * row - 3; space++) {
                    System.out.print(" ");
                }

                System.out.print("*");
            }

            System.out.println();
        }

        // Bottom half
        for (int row = size - 1; row >= 1; row--) {

            for (int space = 1; space <= size - row; space++) {
                System.out.print(" ");
            }

            if (row == 1) {
                System.out.print("*");
            } else {
                System.out.print("*");

                for (int space = 1; space <= 2 * row - 3; space++) {
                    System.out.print(" ");
                }

                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        printDiamond(4);
    }
}