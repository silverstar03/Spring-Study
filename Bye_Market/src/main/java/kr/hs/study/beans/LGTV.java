package kr.hs.study.beans;

public class LGTV implements TV{
	private int price;
	private AppleSpeaker speaker;
	
	
	public LGTV() {
		super();
	}

	public LGTV(int price, AppleSpeaker speaker) {
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

	public AppleSpeaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(AppleSpeaker speaker) {
		this.speaker = speaker;
	}
	
	public void PowerOn() {
		System.out.println("LG TV 전원이 켜졌습니다.");
	}
	
	public void PowerDown() {
		System.out.println("LG TV 전원이 꺼졌습니다.");
	}
	
	
}
