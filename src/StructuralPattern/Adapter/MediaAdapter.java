package StructuralPattern.Adapter;

public class MediaAdapter implements MediaPlayer{

	AdvanceMediaPlayer advanceMusicPlayer;
	
	public MediaAdapter(String audioType) {
		// 생성 시, vlc인지 mp4인지 구분
		if(audioType.equalsIgnoreCase("vlc"))
			advanceMusicPlayer = new VlcPlayer();
		
		else if(audioType.equalsIgnoreCase("mp4"))
			advanceMusicPlayer = new Mp4Player();
	}
	
	@Override
	public void play(String audioType, String fileName) {
		// play호출 시, 구체적인 각 플레이어의 메소드를 호출
		if(audioType.equalsIgnoreCase("vlc"))
			advanceMusicPlayer.playVlc(fileName);
		
		else if(audioType.equalsIgnoreCase("mp4"))
			advanceMusicPlayer.playMp4(fileName);
	}
}

