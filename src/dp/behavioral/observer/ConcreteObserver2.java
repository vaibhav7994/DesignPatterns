package dp.behavioral.observer;

/**
 * 
 * @author Vaibhav
 *
 * Concrete implementation of observer,can be changed/added/removed independently
 *         
 */
public class ConcreteObserver2 implements ObserverInterface {

	private SubjectInterface subject;

	@Override
	public void update() {
		System.out.println("Observer 2 has got this message: " + subject.getState());
	}

	public ConcreteObserver2(SubjectInterface subject) {
		this.subject = subject;
		this.subject.registerObserver(this);
	}

	public void addMessage(String message) {
		subject.setState(message + "-sent from observer 2");
	}

}