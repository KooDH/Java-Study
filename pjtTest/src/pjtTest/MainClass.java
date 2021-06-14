package pjtTest;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
//		System.out.println("Input Number");
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		int inputNum = scanner.nextInt();//사용자가 숫자를 입력하는 변수를 만들어줌.
//		
//		for (int i = 0; i < 10; i++) { //9까지 루프를 돌린다.
//			System.out.println(inputNum * i);
//		}
//		
//		
//		
//		scanner.close();//한번 쓰고나면 resources를 회수하는 습관을 가질것.
		
		int i = 10;
		
		do { //while문과의 차이점은 
			 //do ~ while은 do 내부에있는 한번은 무조건 실행 
			 //그 이후는 같음.
			System.out.println("무조건 1번은 실행합니다.");
			i++;
		} while ( i < 13); //do ~ while
		
	}//main
}
