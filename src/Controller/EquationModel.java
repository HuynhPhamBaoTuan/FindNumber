package Controller;

import Model.NumbersInfo;

public class EquationModel {
    public double calculateSuperlativeEquation(double coefficientA, double coefficientB) {
        return -coefficientB / coefficientA;
    }

    public double[] calculateQuadraticEquation(double coefficientA, double coefficientB, double coefficientC) {
        double discriminant = coefficientB * coefficientB - 4 * coefficientA * coefficientC;
        double solutionX1 = (-coefficientB + Math.sqrt(discriminant)) / (2 * coefficientA);
        double solutionX2 = (-coefficientB - Math.sqrt(discriminant)) / (2 * coefficientA);

        return new double[]{solutionX1, solutionX2};
    }

    public NumbersInfo getNumbersInfo(double... numbers) {
        int evenCount = 0;
        int oddCount = 0;
        int squareCount = 0;

        for (double number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            if (Math.sqrt(number) % 1 == 0) {
                squareCount++;
            }
        }

        return new NumbersInfo(evenCount, oddCount, squareCount);
    }
}