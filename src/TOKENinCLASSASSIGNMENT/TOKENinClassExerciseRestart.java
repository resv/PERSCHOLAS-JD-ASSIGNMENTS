//package TOKENinCLASSASSIGNMENT;
//
//import java.util.Arrays;
//import java.util.Stack;
//
//public class TOKENinClassExerciseRestart {
//
//	public static boolean isNumeric(String str) {
//		try {
//			double d = Double.parseDouble(str);
//		} catch (NumberFormatException nfe) {
//			return false;
//		}
//		return true;
//	}
//
//	public static void main(String[] args) {
//
//		Stack<String> value = new Stack<String>();
//
//		Stack<String> operator = new Stack<String>();
//
//		String[] token = "(2+3/1*4-(10+(5*3)))".split("");
//
//		for (int i = 0; i < token.length; i++) {
//			if (token[i].equals("(")) {
//				operator.add(token[i]);
//
//			} else if (isNumeric(token[i])) {
//				value.add(token[i]);
//			}else {
//				while(!operator.lastElement().equals("(")) {
//					String op = operator.pop();
////					operator.pop();
//					String num1 = value.pop();
////					value.pop();
//					String num2 = value.pop();
////					value.pop();
////			
////					MyCalc x = new MyCalc();
////					Integer adder = x.sum.compute(num1,num2);
////					Integer subtracter = x.subtract.compute(num1,num2);
////				// BECAUSE OF FLOW CONTROL THE NUM1 & NUM2 ONLY GET CHANGED AFTER WE SET THE ABOVE INTS
////					Float num1f = Float.valueOf(num1);
////					Float num2f = Float.valueOf(num2);
////					
////					Float multiplier = x.multiply.compute(num1f,num2f);
////					Float divider = x.divide.compute(num1f,num2f);
////				
////					switch (op) {
////						case "+" : System.out.println("Result is : " + num1 + " " + op + " " + num2 + " = " + adder);
////									break;
////						case "-" : System.out.println("Result is : " + num1 + " " + op + " " + num2 + " = " + subtracter);
////									break;
////						case "*" : System.out.println("Result is : " + num1 + " " + op + " " + num2 + " = " + multiplier);
////									break;
////						case "/" : System.out.println("Result is : " + num1 + " " + op + " " + num2 + " = " + divider);
////									break;
////						default: System.out.println("Something went wrong");
////					}
//				}
//			}
//		}
//		System.out.println("Orignal token : " + Arrays.asList(token));
//		System.out.println("Operator stack : " + operator);
//		System.out.println("Value stack: " + value);
//	}
//}
//
