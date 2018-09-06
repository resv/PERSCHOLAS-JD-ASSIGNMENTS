package LAMBDA_FUNCTIONAL_INTERFACE.Calculator;

public class MyCalc {

	public Calculator<Integer> sum = (num1, num2)-> {
		int result = (num1+num2);
		return result;
	};
	
	public Calculator<Integer> subtract = (num1,num2)->{
		int result = (num1-num2);
		return result;
	};
	
	public Calculator<Float> multiply = (num1,num2)->{
		Float result = (num1*num2);
		return result;
	};
	
	Calculator<Float> divide = (num1,num2)->{
		Float result = (num1/num2);
		return result;
	};
	
}
