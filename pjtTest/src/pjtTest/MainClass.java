package pjtTest;

public class MainClass {

	public static void main(String[] args) {
		
		ChildClass child = new ChildClass(); // 자식 클래스 생성
		ParentClass parent = new ParentClass();
		
		child.childFun(); 	// 자식 메서드 호출
		child.parentFun(); 	//자식 클래스를 생성했지만. 부모클래스를 상속 받았기 때문에
							//부모 메서드까지 호출할 수 있음.
		
		
	}//결곽 값은 자식 클래스를 호출 했지만, 부모 클래스 먼저 호출된것을 확인할 수 있다.
}
