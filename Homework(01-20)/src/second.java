import java.util.Scanner;

public class second {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while (true) {

			System.out.println("���Ͻô� ����� �Է��ϼ���.(1~4)");

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
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
			}
		}

	}
	
	
	private static void BMI() {
		// TODO Auto-generated method stub
		System.out.println("BMI�� ���� Ű(cm)�� �����Ը� �Է��ϼ���??");
		
		double height = input.nextDouble();
		int weight = input.nextInt();
		
		double bmi = (weight / ((height * height) / 10000));
		System.out.println("BMI�� ����? " + String.format("%.2f", bmi) + "�Դϴ�.");

	}
	
	
	

	private static void drgree() {
		// TODO Auto-generated method stub
		System.out.println("������ �Է��ϼ���?");
		int drgree = input.nextInt();
		double changedDrgree = drgree * 1.8 + 32;
		System.out.println("ȭ����? " + String.format("%.1f", changedDrgree));

	}

	private static void totalandAverage() {
		// TODO Auto-generated method stub
		System.out.println("���� �Ϸķ� 5���� �Է��ϼ���?");
		int[] num = new int[5];
		int total = 0;

		for (int i = 0; i < 5; i++) {
			num[i] = input.nextInt();
			total += num[i];
		}

		System.out.println("������ " + total + " ����� " + total / 5.0);

	}

}
