import java.io.IOException;
import java.util.logging.*;
public class Calculator {
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	double addition(double number1,double number2) {
		try {
			return number1+number2;
		}
		catch(Exception e) {
			LOGGER.log(Level.INFO, "Numbers cannot be added");
		}
		return -9.99999;
	}
	
	double multiplication(double number1,double number2) {
		try {
			return number1*number2;
		}
		catch(Exception e) {
			LOGGER.log(Level.INFO, "Numbers cannot be multiplied");
		}
		return 0.0;
	}
	
	double division(double number1,double number2) {
		double res;
		try {
			res = number1/number2;
		}
		catch(Exception e) {
			LOGGER.log(Level.INFO, "Divide by zero exception");
			res = 0.0;
		}
		return res;
	}
	
	
	
}