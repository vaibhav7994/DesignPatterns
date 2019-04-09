package dp.behavioral.observer;

/**
 * 
 * @author Vaibhav
 *
 * Concrete implementation of observer,can be changed/added/removed independently
 *         
 */
public class ConcreteObserver1 implements ObserverInterface {

	private SubjectInterface subject;

	@Override
	public void update() {
		System.out.println("Observer 1 has got this message: " + subject.getState());
	}

	public ConcreteObserver1(SubjectInterface subject) {
		this.subject = subject;
		this.subject.registerObserver(this);
	}

	public void addMessage(String message) {
		subject.setState(message + "-sent from observer 1");
	}

}