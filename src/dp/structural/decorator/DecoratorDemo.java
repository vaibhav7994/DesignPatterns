package dp.structural.decorator;

public class DecoratorDemo {

	public static void main(String[] args) {

		Component component=new ConcreteDecorator1(new ConcreteComponent1());
		System.out.println(component.display());
		
		System.out.println(new ConcreteDecorator2(component).display());
	}

}
