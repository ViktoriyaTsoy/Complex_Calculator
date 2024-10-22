public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        ComplexNumber c1 = new ComplexNumber(4, 5);
        ComplexNumber c2 = new ComplexNumber(2, 3);

        ComplexNumber resultAdd = calculator.add(c1, c2);
        ComplexNumber resultMultiply = calculator.multiply(c1, c2);
        ComplexNumber resultDivide = calculator.divide(c1, c2);

        System.out.println("Addition: " + resultAdd);
        System.out.println("Multiplication: " + resultMultiply);
        System.out.println("Division: " + resultDivide);
    }
}