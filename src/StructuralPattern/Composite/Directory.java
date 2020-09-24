package StructuralPattern.Composite;

import java.util.ArrayList;

public class Directory extends Entry{

	ArrayList<Entry> directory = new ArrayList<Entry>(); //자식객체를 담기위한 ArrayList
	
	public Directory(String name) {
		super(name);
	}

	@Override
	public void add(Entry entry) {	//자식객체 추가
		directory.add(entry);
	}

	@Override
	public void PrintList(String path) { //디렉토리 목록 보여주기
		path += "/" + this.name;
		System.out.println(path);
		for(int i = 0; i < directory.size(); i++) {
			directory.get(i).PrintList(path);
		}
	}
}

