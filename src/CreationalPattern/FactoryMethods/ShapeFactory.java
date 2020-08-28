package CreationalPattern.FactoryMethods;

public class ShapeFactory {
	
	// 팩토리 메소드 - 객체 생성 후 반환
	public Shape getShape(String shapeType) {
		if(shapeType == null) {
			return null;
		}
		if(shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}
		if(shapeType.equalsIgnoreCase("REACTANGLE")) {
			return new Rectangle();
		}
		if(shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}
}
