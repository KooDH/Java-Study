package pjtTest;

public class MainClass {

	public static void main(String[] args) {
		
		int[] iArr = {10, 20, 30}; //배열 선언할때 {}을 사용
		
		ObjectClass obj1 = new ObjectClass(10,20); //디폴트 생성자 생성
		
		obj1.getInfo(); //매서드 호출
		//결과물은	x--> 10
		//		y--> 20
	}
}
