package StructuralPattern.Proxy;

public interface PrintableSubject {
	void setPrintName(String name);
	String getPrinterName();
	void print(String string);
}

