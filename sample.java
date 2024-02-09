public class Calculator {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        // Intentional code smell - unused variable
        int result = num1 * num2;
        return result;
    }

    // Intentional error - divide by zero
    public int divide(int num1, int num2) {
        return num1 / 0;
    }

    // Intentional code smell - duplicate code
    public int square(int num) {
        return num * num;
    }

    // Intentional error - method without return statement
    public void missingReturn() {
        int a = 5;
        int b = 10;
    }

    // Intentional code smell - long method
    public int complexCalculation(int num1, int num2, int num3, int num4, int num5) {
        int result = num1 + num2;
        result = result * num3;
        result = result - num4;
        result = result / num5;
        return result;
    }

    // Intentional code smell - magic number
    public double calculateArea(double radius) {
        // 3.14 is a magic number, should be replaced with a named constant
        return 3.14 * radius * radius;
    }

    // Intentional code smell - unnecessary method call
    public String greet(String name) {
        return createGreeting(name);
    }

    private String createGreeting(String name) {
        return "Hello, " + name + "!";
    }
}
