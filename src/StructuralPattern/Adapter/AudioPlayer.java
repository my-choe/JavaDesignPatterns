package StructuralPattern.Adapter;

public class AudioPlayer implements MediaPlayer{

	@Override
	public void play(String audioType, String fileName) {
		
		if(audioType.equalsIgnoreCase("mp3")) {
			System.out.println("♪ mp3 파일음악을 재생합니다. 파일명 : " + fileName);
		}
		
		// 'vlc'나 'mp4' 포맷은 MediaAdapter로 처리한다.
		else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
			MediaAdapter mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		}
	}
	
	
}


