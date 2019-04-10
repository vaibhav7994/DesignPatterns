package dp.structural.decorator;

public class ConcreteDecorator2 extends Decorator {

	public ConcreteDecorator2(Component componentImpl) {
		super(componentImpl);
	}

	@Override
	public String display() {
		return super.display()+"::"+addDecorator2String();
	}

	private String addDecorator2String() {
		return "Decorated with decorator 2";
	}

}
