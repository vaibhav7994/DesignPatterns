package dp.structural.decorator;

/**
 * @author Vaibhav
 * 
 * 
 * Decorator base class which inherits from component and use composition for providing functionalities
 */
public abstract class Decorator implements Component {

	protected Component component;

	public Decorator(Component componentImpl) {
		this.component = componentImpl;
	}
	
	public String display() {
		return component.display();
	}

}
