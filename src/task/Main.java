package task;
public class Main {
    public static void main(String[] args) {

    }
    public int romanToInt(String s) {
        int result = 0;
        int previousSymbolValue = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentSymbolValue = romanToInt(s.charAt(i));
            if (currentSymbolValue < previousSymbolValue) {
                result -= currentSymbolValue;
            } else {
                result += currentSymbolValue;
            }
            previousSymbolValue = currentSymbolValue;
        }
        return result;
    }

    private int romanToInt(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}