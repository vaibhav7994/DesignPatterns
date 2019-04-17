package dp.creational.abstractfactory;


/**
 * 
 * @author Vaibhav
 *
 * Concrete Factory 1
 */
public class ConcreteFactory1 implements AbstractFactory {

	@Override
	public AbstractProductA createProductA() {
		return new ProductA1();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ProductB1();
	}

}
