package dp.creational.factory;

/**
 * 
 * @author Vaibhav
 *
 * Abstract creator which delegates creation of object
 */
public abstract class Creator {

	protected abstract Product createProduct(EnumParam type);

	public void operation(EnumParam type) {
		System.out.println("Hello from Creator with type,we have product " + createProduct(type).display());
	}

	public void operation() {
		System.out.println("Hello from Creator without type,we have product " + createProduct(null).display());
	}
}
