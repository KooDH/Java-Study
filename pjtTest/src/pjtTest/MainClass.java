package pjtTest;

public class MainClass {

	public static void main(String[] args) {
		
		ChildClass child1 = new ChildClass(); //생성자 호출
		
//		child1.name = "hong gil dong";
//		child1.gender = "male";
//		child1.age = 20; // 숫자이기 때문에 ""를 안넣어줘도 됨.
		
		
		child1.setInfo("hong", "gender", 20);		
		child1.getInfo(); 	// getinfo를 불러옴. 하지만
							// 값을 지정해주지 않았기에 
							// 호출부
	}
}
