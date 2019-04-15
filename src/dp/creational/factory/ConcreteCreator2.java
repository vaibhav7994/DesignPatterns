package dp.creational.factory;

/**
 *  
 * @author Vaibhav
 *
 *
 * Concrete Creator which returns product
 */
public class ConcreteCreator2 extends Creator {

	@Override
	public Product createProduct(EnumParam type) {
		return new Product3();
	}

}
