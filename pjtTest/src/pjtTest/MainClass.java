package pjtTest;

public class MainClass {

	public static void main(String[] args) {
		
		int i = 10;
		int j = 0;
		int r = 0;
		
		System.out.println("Exception BEFORE");
		
		try {
			r = i / j; //예외가 처리될만한 코드를 안에 넣어줌
		} catch (Exception e) { //예외처리를 해두게 되면 
								// r = i / j코드는 실행 안되지만
								// 아래의 msg코드는 실행이 됌
			e.printStackTrace();
			String msg = e.getMessage();
			System.out.println("msg : " + msg);
		}
		
		
//		r = i / j; //예외 처리가 필요하며, AFTER는 출력이 안됌
		
		System.out.println("Exception AFTER");
	}
}
