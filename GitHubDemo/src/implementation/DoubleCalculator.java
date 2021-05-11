package implementation;

import util.Calculator;

/**
 * Double Calculator
 * Implementation of Generic Calculator
 * 
 * @author Dhiren
 */
public class DoubleCalculator implements Calculator<Double> {

	@Override
	public Double add(Double num1, Double num2) {
		return num1+num2;
	}

	@Override
	public Double subtract(Double num1, Double num2) {
		return num1-num2;
	}

	@Override
	public Double multiply(Double num1, Double num2) {
		return num1*num2;
	}

	@Override
	public Double divide(Double num1, Double num2) {
		return num1/num2;
	}

}
