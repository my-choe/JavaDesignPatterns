package CreationalPattern.Singleton;

public class Speaker {
	private static Speaker speaker;	// Speaker 클래스의 생성자를 외부에서 호출할 수 없도록 private로 선언
	private int volume;
	
	private Speaker() {
		volume = 5;
	}
	
	public static Speaker getInstance() {
		// getInstance()메소드를 사용하여 인스턴스가 이미 생성되어 있는지 확인
		// 생성되지 않은 상황이라면 생성자를 호출해 인스턴스를 생성하고
		// 생서오디어 있다면 정적변수 speaker 변수를 참조하는 인스턴스를 반환
		if(speaker == null) {
			speaker = new Speaker();
		}
		return speaker;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
}
