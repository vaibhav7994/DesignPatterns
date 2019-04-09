package dp.behavioral.observer;

/**
 * 
 * @author Vaibhav
 *
 * Concrete subject which notifies observer about changes in state
 */
public class ConcreteSubject1 extends SubjectInterface {

	private String message;

	@Override
	public void setState(String message) {
		this.message = message + "-to subject 1";
		notifyObservers();
	}

	@Override
	public String getState() {
		return message;
	}

}
