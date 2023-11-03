package kr.co.softsoldesk.beans;

public class SamsungTV implements TV{
	private AppleSpeaker speaker;
	private int price;
	

	public SamsungTV(){
	System.out.println("===> apple ��ü ����");
	}

	 public SamsungTV(AppleSpeaker speaker, int price){
	 System.out.println("===> SamsungTV(3) ��ü ����");
	 this.speaker = speaker;
	 this.price=price;
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

	public void powerOn() {
		System.out.println("SamsungTV---전원 켠다.");
		System.out.println("김진욱 : " +price);
		
	}

	public void powerOff() {
		System.out.println("SamsungTV---전원 끈다");
		
	}

	public void volumeUp() {
		speaker.volumeUp();
		
	}

	public void volumeDown() {
		speaker.volumeDown();
		
	}

	

}
