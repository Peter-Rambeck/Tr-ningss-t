package Opg4Square;

public class PrintSquare {

    int square;
    char ch;

    public void printSquare(int square, char ch) {

        if (square < 0) {
            square = Math.abs(square);
        }
        if (square > 20) {
            System.out.println("Number too large");
        } else {
            for (int i = 0; i < square; i++) {
                System.out.println();
                System.out.print(ch);

                for (int j = 0; j < square - 1; j++) {
                    System.out.print("  ");
                    System.out.print(ch);

                }
            }
        }
    }
}



