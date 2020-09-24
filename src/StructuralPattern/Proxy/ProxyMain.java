package StructuralPattern.Proxy;

public class ProxyMain {

	public static void main(String[] args) {
		PrintableSubject p = new PrinterProxy("Simple");
		
		// 프록시가 실행됨
		System.out.println(p.getPrinterName());
		
		// realSubject가 실행
		p.print("프린트 요청");
	}

}

