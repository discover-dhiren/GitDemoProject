package implementation;

import util.Calculator;

public class IntegerCalculator implements Calculator<Integer> {
	
	@Override
	public Integer add(Integer num1, Integer num2) {
		return num1+num2;
	}
	
	@Override
	public Integer subtract(Integer num1, Integer num2) {
		return num1-num2;
	}
	
	@Override
	public Integer multiply(Integer num1, Integer num2) {
		return num1*num2;
	}
	
	@Override
	public Integer divide(Integer num1, Integer num2) {
		return num1/num2;
	}
	
}
