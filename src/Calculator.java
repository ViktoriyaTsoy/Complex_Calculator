import java.util.logging.Logger;

public class Calculator {
    private static final Logger logger = LoggerUtil.getLogger();

    public ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
        ComplexNumber result = Operations.add(c1, c2);
        logger.info("Adding " + c1 + " and " + c2 + ": " + result);
        return result;
    }

    public ComplexNumber multiply(ComplexNumber c1, ComplexNumber c2) {
        ComplexNumber result = Operations.multiply(c1, c2);
        logger.info("Multiplying " + c1 + " and " + c2 + ": " + result);
        return result;
    }

    public ComplexNumber divide(ComplexNumber c1, ComplexNumber c2) {
        ComplexNumber result = Operations.divide(c1, c2);
        logger.info("Dividing " + c1 + " by " + c2 + ": " + result);
        return result;
    }
}