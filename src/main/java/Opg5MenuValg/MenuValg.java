package Opg5MenuValg;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuValg {

    public int dialogueMenu() {

        int menuVal = 0;
        int counter = 0;
        String[] menu = {"Pizza", "Spaghetti", "Pie", "Fruit"};
        Scanner input = new Scanner(System.in);

        System.out.println("Menu");
        for (String i : menu) {
            counter++;
            System.out.println(counter + "\t" + i);
        }

        System.out.println("Please choose from the menu");

        if (input.hasNextInt()) {
                int menuChoice = input.nextInt();
                if (menuChoice > 0 && menuChoice < 5) {
                    switch (menuChoice) {
                        case 1:
                            System.out.println("You choose Pizza!");
                            System.out.println("exit with '0'");
                            if (input.nextInt() == 0) {
                                System.out.println("Your order: " + menu[0]);
                                menuVal = 1;
                            }
                            break;
                        case 2:
                            System.out.println("You like the Spaghetti I presume!");
                            System.out.println("exit with '0'");
                            if (input.nextInt() == 0) {
                                System.out.println("Your order: " + menu[1]);
                                menuVal = 2;
                            }
                            break;
                        case 3:
                            System.out.println("Pie is nice");
                            System.out.println("exit with '0'");
                            if (input.nextInt() == 0) {
                                System.out.println("Your order: " + menu[2]);
                                menuVal = 2;
                            }
                            break;
                        case 4:
                            System.out.println("Fruit is healthy and tasty");
                            System.out.println("exit with '0'");
                            if (input.nextInt() == 0) {
                                System.out.println("Your order: " + menu[3]);
                                menuVal = 4;
                            }
                            break;
                        default:
                            System.out.println("Not working");
                            break;
                    }
                } else {
                        System.out.println("Number is not on the menu");
                        dialogueMenu();
                    }
            } else {
                System.out.println("Please choose a number");
                dialogueMenu();
            }
        System.out.println("menu #: " + menuVal);
        return menuVal;
    }
}

