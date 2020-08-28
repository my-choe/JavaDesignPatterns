package CreationalPattern.AbstractFactory;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		// 팩토리의 팩토리인 FactoryProducer를 통해 구체적인 팩토리 shapeFactory를 얻는다.
		AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
		
		// shapeFactory로 구체적인 Product를 만든다(팩토리메소드와 동일)
		Shape shape1 = shapeFactory.getShape("RECTANGLE");
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape("SQUARE");
		shape2.draw();
		
		//이번엔 FactoryProducer를 통해 구체적인 팩토리 shapeFactory1을 얻는다.
		AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
		
		//위와 동일하지만, 이번엔 shapeFactory1로 produect를 만든다.
		Shape shape3 = shapeFactory1.getShape("RECTANGLE");
		shape3.draw();
		
		Shape shape4 = shapeFactory1.getShape("SQUARE");
		shape4.draw();
	}

}
