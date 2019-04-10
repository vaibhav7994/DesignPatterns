package dp.structural.decorator;

public class ConcreteDecorator1 extends Decorator {

	public ConcreteDecorator1(Component componentImpl) {
		super(componentImpl);
	}

	@Override
	public String display() {
		return super.display()+"::"+addDecorator1String();
	}

	private String addDecorator1String() {
		return "Decorated with decorator 1";
	}

}
