package StructuralPattern.Decorator;

public class Flowers extends TreeDecorator {

	public Flowers(ChristmasTree christmasTree) {
		super(christmasTree);
	}
	
	public String addFlowers() {
		return " with Flowers";
	}
	
	@Override
	public String decorate() {
		return super.decorate() + addFlowers();
	}
}


