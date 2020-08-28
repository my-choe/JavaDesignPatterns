package CreationalPattern.Prototype;

public class PrototypePatternDemo {

	public static void main(String[] args) {
		ShapeCache.loadCache();
		
		Shape clonedShape1 = ShapeCache.getShape("1");
		System.out.println("clonedShape1 Type : " + clonedShape1.getType());
		clonedShape1.draw();
		
		Shape clonedShape2 = ShapeCache.getShape("2");
		System.out.println("clonedShape3 Type : " + clonedShape2.getType());
		clonedShape2.draw();
		
		Shape clonedShape3 = ShapeCache.getShape("3");
		System.out.println("clonedShape3 Type : " + clonedShape3.getType());
		clonedShape3.draw();
	}

}
