package Model;

public class NumbersInfo {
    private final int evenCount;
    private final int oddCount;
    private final int squareCount;

    public NumbersInfo(int evenCount, int oddCount, int squareCount) {
        this.evenCount = evenCount;
        this.oddCount = oddCount;
        this.squareCount = squareCount;
    }

    public int getEvenCount() {
        return evenCount;
    }

    public int getOddCount() {
        return oddCount;
    }

    public int getSquareCount() {
        return squareCount;
    }
}