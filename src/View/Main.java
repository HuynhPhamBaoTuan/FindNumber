package View;

import Controller.EquationController;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EquationController controller = new EquationController();

        int option;

        do {
            View.displayMenu();
            option = scanner.nextInt();

            switch (option) {
                case 1 -> controller.calculateSuperlativeEquation(scanner);
                case 2 -> controller.calculateQuadraticEquation(scanner);
                case 3 -> System.out.println("Exiting the program.");
                default -> System.out.println("Invalid option. Please try again.");
            }
        } while (option != 3);
    }
}