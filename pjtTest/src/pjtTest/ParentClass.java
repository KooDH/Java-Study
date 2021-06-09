package pjtTest;

public class ParentClass {

	public ParentClass() {//부모클래스 생성자 생성 , 생성자는 대문자로
		System.out.println("ParentClass constructor");
	}
	
	public void parentFun() {//부모클래스 메서드 생성 , 메서드는 소문자로
		System.out.println("parentFun()");
	}
	
	private void privateFun() {	//private으로 생성하면 호출되지 않는다.
								//호출부에서 선언하여 사용하지 못한다.
		System.out.println("privateFun()");
	}
	
}
