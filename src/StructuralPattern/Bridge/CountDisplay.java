package StructuralPattern.Bridge;

public class CountDisplay extends Display{

	public CountDisplay(DisplayImpl impl) {
		super(impl);
	}
	
	public void multiDisplay(int times) {
		open();
		for(int i = 0; i < times; i++) {	//times회 반복해서 표시
			print();
		}
		close();
	}

}

