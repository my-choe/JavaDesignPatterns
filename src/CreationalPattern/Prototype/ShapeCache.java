package CreationalPattern.Prototype;

import java.util.Hashtable;

public class ShapeCache {
	private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();
	
	/* 데이터베이스에서 구체적인 클래스를 가져와 Hashtable에 저장하는 클래스
	 * 각 Shape마다 데이터베이스 쿼리 실행 및 shape 생성
	 * shapeMape.pub(shapeKey, shape);
	 * 예시로 세가지 도형 추가 ↓
	 */
	
	public static void loadCache() {
		Circle circle = new Circle();
		circle.setId("1");
		shapeMap.put(circle.getId(), circle);
		
		Square sqaure = new Square();
		sqaure.setId("1");
		shapeMap.put(sqaure.getId(), sqaure);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setId("1");
		shapeMap.put(rectangle.getId(), rectangle);
	}
	
	public static Shape getShape(String shapeType) {
		Shape cachedShape = shapeMap.get(shapeType);
		return (Shape) cachedShape.clone();
	}

}
