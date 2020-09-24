package StructuralPattern.Composite;

public class File extends Entry{
	public File(String name) {
		super(name);
	}

	@Override
	public void add(Entry entry) {
		// File은 내용물 객체로 안에 또 다른 객체를 포함할 수 없음.
	}

	@Override
	public void PrintList(String path) {
		System.out.println(path + "/" + this.name);
	}
	
}

