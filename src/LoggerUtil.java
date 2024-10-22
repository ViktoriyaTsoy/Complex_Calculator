import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.FileHandler;
import java.util.logging.LogManager;

public class LoggerUtil {
    private static Logger logger;

    static {
        try {
            logger = Logger.getLogger("ComplexCalculator");
            FileHandler fh = new FileHandler("calculator.log", true);
            fh.setFormatter(new SimpleFormatter());
            LogManager.getLogManager().addLogger(logger);
            logger.addHandler(fh);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Logger getLogger() {
        return logger;
    }
}