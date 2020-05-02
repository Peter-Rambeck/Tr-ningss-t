package Opg4Square;

public class PrintSquare {

    int square;

    public void printSquare(int square) {

        for (int i = 0; i < square; i++) {
            System.out.println();
            System.out.print("*");

            for (int j = 0; j < square-1; j++) {
                System.out.print("  ");
                System.out.print("*");

            }
        }
    }
}




