package LAMBDA_FUNCTIONAL_INTERFACE.Calculator;

@FunctionalInterface
public interface Calculator<T> {

	public T compute(T num1, T num2);
}
