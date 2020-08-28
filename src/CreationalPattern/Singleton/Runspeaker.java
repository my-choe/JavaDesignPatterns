package CreationalPattern.Singleton;

public class Runspeaker {

	public static void main(String[] args) {
		Speaker speaker1 = Speaker.getInstance();
		Speaker speaker2 = Speaker.getInstance();
		Speaker speaker3 = Speaker.getInstance();
		
		System.out.println(speaker1);
		System.out.println(speaker2);
		System.out.println(speaker3);
		
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		System.out.println(speaker3.getVolume());
		
		speaker1.setVolume(10);
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		System.out.println(speaker3.getVolume());
		
		speaker2.setVolume(20);
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		System.out.println(speaker3.getVolume());
	}
	
	/*
	 * 한 객체의 음량을 조절해도 모두 변경됨 → 모두 같은 객체임을 확인할 수 있음
	 * 다만 다중 스레드의 경우 동시에 volume 변수값 갱신 시, 문제 발생 가능
	 * 
	 * 해결 방법
	 * 1. 정적 변수에 인스턴스를 만들어 바로 초기화 한다.
	 * 	  private static Speaker speaker = new Speaker();
	 * 
	 * 2. 또는 인스턴스를 만드는 메서드를 synchronized를 사용하여 동기화 한다.
	 * 	  public synchoronized static Speaker getInstance()
	 *    public synchronized void setVolume(int volume) 
	 * */

}
