package kr.hs.study.beans;

public class SonySpeaker implements Speaker{
	
	public void VolumeUp() {
		System.out.println("TV 볼륨이 커졌습니다.");
	}
	
	public void VolumeDown() {
		System.out.println("TV 볼륨이 줄어들었습니다.");
	}
}
