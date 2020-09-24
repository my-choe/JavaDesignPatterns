package StructuralPattern.Decorator;

public class Lights extends TreeDecorator{

	public Lights(ChristmasTree christmasTree) {
		super(christmasTree);
	}
	
	public String addLights() {
		return " with Lights";
	}
	
	@Override
	public String decorate() {
		return super.decorate() + addLights();
	}
}

