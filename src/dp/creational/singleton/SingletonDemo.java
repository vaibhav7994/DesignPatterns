package dp.creational.singleton;

/**
 * 
 * @author Vaibhav
 *
 * Demo class for singleton
 */
public class SingletonDemo {

	public static void main(String[] args) {

		Singleton singletonInstance1 = Singleton.getInstance();

		Singleton singletonInstance2 = Singleton.getInstance();

		System.out.println(singletonInstance1 + "\n" + singletonInstance2);
	}

}
