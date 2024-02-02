package Controller;

import Controller.EquationModel;
import View.View;
import java.util.Scanner;

public class EquationController {
    private final EquationModel model;

    public EquationController() {
        model = new EquationModel();
    }

    public void calculateSuperlativeEquation(Scanner scanner) {
        View.displaySuperlativeEquationInputPrompt();
        double coefficientA = scanner.nextDouble();
        double coefficientB = scanner.nextDouble();

        double solutionX = model.calculateSuperlativeEquation(coefficientA, coefficientB);
        View.displaySolution(solutionX);

        View.displayNumbersInfo(model.getNumbersInfo(coefficientA, coefficientB));
    }

    public void calculateQuadraticEquation(Scanner scanner) {
        View.displayQuadraticEquationInputPrompt();
        double coefficientA = scanner.nextDouble();
        double coefficientB = scanner.nextDouble();
        double coefficientC = scanner.nextDouble();

        double[] solutions = model.calculateQuadraticEquation(coefficientA, coefficientB, coefficientC);
        View.displaySolutions(solutions);

        View.displayNumbersInfo(model.getNumbersInfo(coefficientA, coefficientB, coefficientC));
    }

}