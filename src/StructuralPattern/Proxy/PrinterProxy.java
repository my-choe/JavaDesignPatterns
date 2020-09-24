package StructuralPattern.Proxy;

public class PrinterProxy implements PrintableSubject{
	private String name;
	private PrinterRealSubject real;
	
	public PrinterProxy(String name) {
		this.name = name;
	}

	@Override
	public synchronized void setPrintName(String name) {
		if(real != null) {
			real.setPrintName(name);
		}
		this.name = name;
	}

	@Override
	public String getPrinterName() {
		return name;
	}

	@Override
	public synchronized void print(String string) {
		realize();
		real.print(string);
	}
	
	private synchronized void realize() {
		if(real == null) {
			real = new PrinterRealSubject(name);
		}
	}
	
}

