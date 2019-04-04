package dp.behavioral.strategy;

/**
 * 
 * @author Vaibhav
 * 
 * Client class which uses carious strategies
 *
 */
public class User {
	
	AlgorithmInterface algo;
	
	public User(AlgorithmInterface algo)
	{
		this.algo=algo;
	}
	
	public void printBusinessLogic()
	{
		
		System.out.println("Using "+ algo.printMessage()+" for implementing my logic");
	}

}
