package StructuralPattern.Adapter;

public class VlcPlayer implements AdvanceMediaPlayer{

	@Override
	public void playVlc(String fileName) {
		System.out.println("♪ vlc 파일음악을 재생합니다. 파일명 : " + fileName);
	}

	@Override
	public void playMp4(String fileName) {
		// do nothing
	}
}

