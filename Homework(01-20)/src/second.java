
/*
 *================== Second Question=================
 * this code is made with "while" and "switch" function.   
 * @author SeongJin * 
 */

import java.util.Scanner;

public class second {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while (true) {

			System.out.println("원하시는 기능을 입력하세요.(1~4)");

			int num = input.nextInt();

			switch (num) {
			case 1:
				totalandAverage();
				break;
			case 2:
				drgree();
				break;
			case 3:
				BMI();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
		}

	}
	
	
	private static void BMI() {
		// TODO Auto-generated method stub
		System.out.println("BMI를 위해 키(cm)와 몸무게를 입력하세여??");
		
		double height = input.nextDouble();
		int weight = input.nextInt();
		
		double bmi = (weight / ((height * height) / 10000));
		System.out.println("BMI의 값은? " + String.format("%.2f", bmi) + "입니다.");

	}
	
	
	

	private static void drgree() {
		// TODO Auto-generated method stub
		System.out.println("섭씨를 입력하세여?");
		int drgree = input.nextInt();
		double changedDrgree = drgree * 1.8 + 32;
		System.out.println("화씨는? " + String.format("%.1f", changedDrgree));

	}

	private static void totalandAverage() {
		// TODO Auto-generated method stub
		System.out.println("점수 일렬로 5개를 입력하세여?");
		int[] num = new int[5];
		int total = 0;

		for (int i = 0; i < 5; i++) {
			num[i] = input.nextInt();
			total += num[i];
		}

		System.out.println("총점은 " + total + " 평균은 " + total / 5.0);

	}

}
