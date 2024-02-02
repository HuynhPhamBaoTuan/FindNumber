package View;

import Model.NumbersInfo;

public class View {
    public static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Calculate Superlative Equation");
        System.out.println("2. Calculate Quadratic Equation");
        System.out.println("3. Exit");
        System.out.print("Select an option: ");
    }

    public static void displaySuperlativeEquationInputPrompt() {
        System.out.println("\nCalculate Superlative Equation");
        System.out.print("Enter coefficient A and B: ");
    }

    public static void displayQuadraticEquationInputPrompt() {
        System.out.println("\nCalculate Quadratic Equation");
        System.out.print("Enter coefficient A and B, C: ");
    }

    public static void displaySolution(double solution) {
        System.out.println("Solution x = " + solution);
    }

    public static void displaySolutions(double[] solutions) {
        System.out.println("Solution x1 = " + solutions[0]);
        System.out.println("Solution x2 = " + solutions[1]);
    }

    public static void displayNumbersInfo(NumbersInfo numbersInfo) {
        System.out.println("Even numbers: " + numbersInfo.getEvenCount());
        System.out.println("Odd numbers: " + numbersInfo.getOddCount());
        System.out.println("Square numbers: " + numbersInfo.getSquareCount());
    }
}