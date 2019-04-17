package dp.creational.abstractfactory;
/**
 * 
 * @author Vaibhav
 *
 * Abstract Factory which creates products
 */
public interface AbstractFactory {
	public AbstractProductA createProductA();

	public AbstractProductB createProductB();
}
