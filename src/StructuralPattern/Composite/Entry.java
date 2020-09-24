package StructuralPattern.Composite;

public abstract class Entry {
	String name;
	public Entry(String name) {
		this.name = name;
	}
	
	public abstract void add(Entry entry);
	public abstract void PrintList(String path);
	
}

