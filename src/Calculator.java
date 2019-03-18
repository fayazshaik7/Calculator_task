public class Calculator {
	double addition(double number1,double number2) {
		try {
			return number1+number2;
		}
		catch(Exception e) {
			
		}
		return -9.99999;
	}
	
	double multiplication(double number1,double number2) {
		try {
			return number1*number2;
		}
		catch(Exception e) {
			
		}
		return 0.0;
	}
	
	double division(double number1,double number2) {
		try {
			return number1/number2;
		}
		catch(ArithmeticException e) {
			
		}
		return 0.0;
	}
	
	
	
}