package verify.exam00;

// 인터페이스 Runnable를 구현클래스로 생성
public class MyRun implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<500; i++) {
			System.out.print("S");
		}
		
	}
	
	

}
