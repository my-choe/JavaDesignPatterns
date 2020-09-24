package StructuralPattern.Proxy;

public class PrinterRealSubject implements PrintableSubject {
	private String name;
	
	public PrinterRealSubject(String name) {
		this.name = name;
		heavyJob("PrinterRealSubject[" + name + "] 인스턴스 생성중..");
	}
	
	private void heavyJob(String string) {
		System.out.println(string);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("생성 완료...");
	}

	@Override
	public void setPrintName(String name) {
		this.name = name;
		
	}

	@Override
	public String getPrinterName() {
		return name;
	}

	@Override
	public void print(String string) {
		System.out.println(string);
	}
	
	
}

