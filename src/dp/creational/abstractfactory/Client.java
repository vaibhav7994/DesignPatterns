package dp.creational.abstractfactory;

/**
 * 
 * @author Vaibhav
 *
 * Client Class which gets factory via composition
 */
public class Client {

	private AbstractFactory factory;

	public Client(AbstractFactory factory) {
		this.factory = factory;
	}

	public void display() {
		System.out.println("Hello from client,I have these products:\n" + factory.createProductA().getProductName()
				+ "\n" + factory.createProductB().getProductDesc());
	}
}
