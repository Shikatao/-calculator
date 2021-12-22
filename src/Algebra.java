

public class Algebra {
    public static int Arithmetic(String operator, int a, int b) {
        int result = 0;
        if (operator.equals("+")) {
            result = a + b;
        }
        if (operator.equals("-")) {
            result = a - b;
        }
        if (operator.equals("*")) {
            result = a * b;
        }
        if (operator.equals("/")) {
            result = a / b;
        }
        return result;



}
    }