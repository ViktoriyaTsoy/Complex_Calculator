public class Operations {
    public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
        return new ComplexNumber(c1.getReal() + c2.getReal(), c1.getImag() + c2.getImag());
    }

    public static ComplexNumber multiply(ComplexNumber c1, ComplexNumber c2) {
        return new ComplexNumber(
            c1.getReal() * c2.getReal() - c1.getImag() * c2.getImag(),
            c1.getReal() * c2.getImag() + c1.getImag() * c2.getReal()
        );
    }

    public static ComplexNumber divide(ComplexNumber c1, ComplexNumber c2) {
        if (c2.getReal() == 0 && c2.getImag() == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        double denominator = c2.getReal() * c2.getReal() + c2.getImag() * c2.getImag();
        return new ComplexNumber(
            (c1.getReal() * c2.getReal() + c1.getImag() * c2.getImag()) / denominator,
            (c1.getImag() * c2.getReal() - c1.getReal() * c2.getImag()) / denominator
        );
    }
}