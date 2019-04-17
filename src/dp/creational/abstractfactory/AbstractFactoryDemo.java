package dp.creational.abstractfactory;

/**
 * 
 * @author Vaibhav
 *
 * Demo class for abstract factory pattern
 */
public class AbstractFactoryDemo {

	public static void main(String[] args) {
		Client client1=new Client(new ConcreteFactory1());
		client1.display();
		
		Client client2=new Client(new ConcreteFactory2());
		client2.display();
	}

}
