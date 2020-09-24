package StructuralPattern.Bridge;

public class Display {
	// impl필드는 Display의 구현을 나타내는 인스턴스로 두 클래스 계층의 '다리'역할
	private DisplayImpl impl;
	
	public Display(DisplayImpl impl) {
		this.impl = impl;
	}
	
	public void open() {
		impl.rawOpen();
	}
	
	public void print() {
		impl.rawPrint();
	}
	
	public void close() {
		impl.rawClose();
	}
	
	public final void display() {
		open();
		print();
		close();
	}
}

