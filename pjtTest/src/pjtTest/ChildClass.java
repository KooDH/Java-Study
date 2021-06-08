package pjtTest;

public class ChildClass {

	public String name; 
	public String gender;
	public int age;
	
	
	public ChildClass() { //생성자 만들기
		System.out.println("child constructor");
	}
	
	public void setInfo(String n, String g , int a) { 
						//호출할때 3개의 값을 넣어주면 된다.
						//호출부에서 값을 주면 setInfo의 객체에 
						// name , gender , age라는 값이 들어갈 수 있음.
						//파라미터 넣지 않을수도 있지만, 넣었을경우 개수를 맞춰주는것이 필수
		
		name = n;		//호출부 > 파라미터 > 매서드 내용
		gender = g;
		age = a;
	}
	
	public void setInfo(int a) { 	//파라미터가 다른 여러개의 메서드를 생성(오버로딩) 할 수 있다.
									
		age = a;
	}
	
	public void getInfo() { // 메서드 생성
							// 선언부
		System.out.println("get info");
		
		System.out.println("name : " + name);		// 정의부
		System.out.println("gender : " + gender);
		System.out.println("age : " + age);
	}
	
}
