package di_01.com.di.spring_di_xml_constructor_ex;

public class Speaker {
	
	  private int volume = 10;
	  
	public void volumeUp() {
		volume++;
		System.out.println("볼륨을 키웁니다. " + volume);
	}
	
	public void volumeDown() {
		volume--;
		System.out.println("볼륨을 낮춥니다. " + volume);
	}
}
