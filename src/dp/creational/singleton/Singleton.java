package dp.creational.singleton;

import java.io.Serializable;

/**
 * 
 * @author Vaibhav
 *
 * Singleton class
 */
public class Singleton implements Cloneable, Serializable {

	private static final long serialVersionUID = 3805245582993621396L;
	private static volatile Singleton instance = null;

	private Singleton() {
		// prevent reflection from changing code
		if (instance != null)
			throw new InstantiationError("Call getInstance Method");
	}

	//To prevent cloning of object
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	// To prevent serialization to create new instances
	protected Object readResolve() {
		return instance;
	}

	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null)
					instance = new Singleton();
			}
		}
		return instance;
	}
}
