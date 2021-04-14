package kr.hs.study.beans;

public class SamsungTV implements TV{
	private int price;
	private SonySpeaker speaker;	
	
	public SamsungTV() {
		super();
	}

	public SamsungTV(int price, SonySpeaker speaker) {
		super();
		this.price = price;
		this.speaker = speaker;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public SonySpeaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(SonySpeaker speaker) {
		this.speaker = speaker;
	}
	
	public void PowerOn() {
		System.out.println("Samsung TV 전원이 켜졌습니다.");
	}
	
	public void PowerDown() {
		System.out.println("Samsung TV 전원이 꺼졌습니다.");
	}
	
}
