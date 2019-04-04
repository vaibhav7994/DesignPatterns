package dp.behavioral.strategy;

/**
 * 
 * @author Vaibhav
 *
 * Demo class showing strategy pattern
 */
public class StrategyDemo {

	public static void main(String[] args)
	{
		//User classes can change their implementation without affecting their business logic 
		
		User user1=new User(new AlgorithmImpl1());
		user1.printBusinessLogic();
		
		User user2=new User(new AlgorithmImpl2());
		user2.printBusinessLogic();
	}
    
}
