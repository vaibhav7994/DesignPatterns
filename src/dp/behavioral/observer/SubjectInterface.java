package dp.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Vaibhav
 *
 * Class every subject needs to extend
 */
public abstract class SubjectInterface {
	private List<ObserverInterface> observers=new ArrayList<>();

	public void registerObserver(ObserverInterface observer) {
		observers.add(observer);
	}

	public void unregisterObserver(ObserverInterface observer) {
		observers.remove(observer);
	}

	public void notifyObservers() {
		for (ObserverInterface observer : observers)
			observer.update();
	}

	public abstract void setState(String message);

	public abstract String getState();

}
