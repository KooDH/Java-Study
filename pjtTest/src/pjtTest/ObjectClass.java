package pjtTest;

public class ObjectClass {

	public int x;	//전역변수 x,y
	public int y;
	
	public ObjectClass(String s , int[] iArr) {//생성자 생성
						//
		System.out.println(" -- Object Class() -- ");
		
		System.out.println("s ---> " + s);
		System.out.println("iArr ---> " + iArr);
	}
	
	public ObjectClass(int x, int y) {	//지역변수 x,y
		this.x 		= x;
		this.y 		= y;
		//전역변수 x,y
	}
	
	public void getInfo() { //메서드 생성
		// TODO Auto-generated method stub
		System.out.println("x --> " + this.x);
		System.out.println("y --> " + this.y);
		
	}
	
}
