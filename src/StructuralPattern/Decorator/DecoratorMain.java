package StructuralPattern.Decorator;

public class DecoratorMain {

	public static void main(String[] args) {
		//Christmas tree만 있음
		ChristmasTree tree = new DefaultChristmasTree();
		System.out.println(tree.decorate());
		
		// Christmas tree + Lights
		ChristmasTree treeWithLights = new Lights(new DefaultChristmasTree());
		System.out.println(treeWithLights.decorate());
		
		//Christmas tree + Lights + Flowers
		ChristmasTree treeWithLightsAndFlowers = new Flowers(new Lights(new DefaultChristmasTree()));
		System.out.println(treeWithLightsAndFlowers.decorate());
	}
}

