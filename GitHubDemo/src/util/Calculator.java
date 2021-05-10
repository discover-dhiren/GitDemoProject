package util;

public interface Calculator<K> {

	public K add(K num1, K num2);
	
	public K subtract(K num1, K num2);
	
	public K multiply(K num1, K num2);
	
	public K divide(K num1, K num2);
	
}