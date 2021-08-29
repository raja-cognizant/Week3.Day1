package Week3.day1;

public class MyPhone {

	public static void main(String[] args) {
		
		System.out.println("**************From AndroidPhone Class***************");
		AndroidPhone androidObj = new AndroidPhone();
		androidObj.takeVideo();
		androidObj.makeCall();
		androidObj.sendMsg();
		androidObj.saveContact();
	
		System.out.println("**************From SmartPhone Class***************");
		
		AndroidPhone smartObj = new SmartPhone();
		//smartObj.connectWhatsApp();
		smartObj.makeCall();
		smartObj.saveContact();
		smartObj.sendMsg();
		smartObj.takeVideo();
		
		
		

	}

}
