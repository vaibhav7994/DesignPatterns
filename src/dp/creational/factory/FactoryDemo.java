package dp.creational.factory;

/**
 * 
 * 
 * @author Vaibhav
 *
 * Demo class for factory pattern
 */
public class FactoryDemo {

	public static void main(String[] args) {
		
		Creator creator=new ConcreteCreator1();
		creator.operation(EnumParam.product2);
		
		Creator creator2=new ConcreteCreator2();
		creator2.operation();

	}

}
