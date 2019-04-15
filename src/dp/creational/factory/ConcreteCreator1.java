package dp.creational.factory;

/**
 *  
 * @author Vaibhav
 *
 *
 * Concrete Creator return product based on type
 */
public class ConcreteCreator1 extends Creator {

	//Use of SimpleFactory Programming idiom
	@Override
	public Product createProduct(EnumParam type) {
		switch (type) {
		case product1:
			return new Product1();

		case product2:
			return new Product2();

		default:
			return null;
		}
	}

}
