package pjtTest;

public class ChildClass extends ParentClass{//부모 클래스를 상속받음

	
	public ChildClass() {//자식클래스 생성자 생성
		System.out.println("ChildClass constructor");
	}
	
	public void childFun() {//자식클래스 메서드 생성
		System.out.println("childFun()");
	}
	
}
