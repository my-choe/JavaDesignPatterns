package StructuralPattern.Composite;

public class CompositeMain {

	public static void main(String[] args) {
		Directory root = new Directory("root");
		Directory bin = new Directory("bin");
		Directory Lkt = new Directory("Lkt");
		File file1 = new File("file1");
		File file2 = new File("file2");
		File file3 = new File("file3");
		File file4 = new File("file4");
		
		root.add(file1); // root디렉토리에 file1 포함
		bin.add(file2); // bin디렉토리에 file2 포함
		bin.add(file3); // bin디렉토리에 file3 포함
		Lkt.add(file4); // Lkt디렉토리에 file4 포함
		root.add(Lkt); // root디렉토리에 Lkt디렉토리 포함
		root.add(bin); // root디렉토리에 bin디렉토리 포함
		
		root.PrintList("");
	}
}

