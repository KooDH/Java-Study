package pjtTest;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("점수를 입력하세요");
		
		Scanner inputNum = new Scanner(System.in);
		
		int score = inputNum.nextInt();//사용자가 숫자를 입력하는 변수를 만들어줌.
		
		
		switch (score) {
				//비교할 대상의 값
		case 90://case는 몇개를 적어주든 상관은 없음.
			System.out.println("Score is : 90");
			break; //break가 걸리게 되면 밑의 코드를 실행하지 않는다.
			
		case 80:
			System.out.println("Score is : 80");
			break;
			
		case 70:
			System.out.println("Score is : 70");
			break;
			
		case 60:
			System.out.println("Score is : 60");
			break; 

		default://모든 case가 아닐경우 default를 실행
				//필수 조건은 아니기 때문에 필요에 따라 쓸것.
			System.out.println("Score is : ?");
			break;
		}
		
		inputNum.close();//한번 쓰고나면 resources를 회수하는 습관을 가질것.
	}
}
