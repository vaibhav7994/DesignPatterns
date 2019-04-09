package dp.behavioral.observer;

/**
 * 
 * @author Vaibhav
 *
 * Demo to illustrate functionality of observer pattern
 */
public class ObserverDemo {

	public static void main(String[] args) {
		SubjectInterface subject=new ConcreteSubject1();
		ConcreteObserver1 observer1=new ConcreteObserver1(subject);
		ConcreteObserver2 observer2=new ConcreteObserver2(subject);
		
		observer1.addMessage("Hello,have a nice day");
		observer2.addMessage("My name is slim shady");
	}

}
