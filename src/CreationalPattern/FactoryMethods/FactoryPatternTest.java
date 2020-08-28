package CreationalPattern.FactoryMethods;

public class FactoryPatternTest {

	public static void main(String[] args) {
		// 팩토리 클래스에서 객체 생성 후 반환
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.draw(); // Circle메소드 호출
		
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.draw(); // Square메소드 호출
		
		Shape shape3 = shapeFactory.getShape("SQUARE");
		shape3.draw(); // Rectangle메소드 호출
	}

}
