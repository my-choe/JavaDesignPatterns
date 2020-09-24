package StructuralPattern.Adapter;

public class Mp4Player implements AdvanceMediaPlayer{

	@Override
	public void playVlc(String fileName) {
		// do nothing
	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("♪ mp4 파일음악을 재생합니다. 파일명 : " + fileName);
	}
}


