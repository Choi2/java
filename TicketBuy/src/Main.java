import java.util.Scanner;

public class Main {
	
	final int RESERVATION = 1;
	final int CANCELATION = 2;
	final int EXIT = 3;
	
	public void start()
	{
		Reservation reservation = new Reservation();
		Scanner input = new Scanner(System.in);
		int selectedNum;
		
		
		while(true)
		{
			reservation.initView();
			selectedNum = input.nextInt();
			
			if(selectedNum == RESERVATION)
			{
				System.out.println("예약을 할 지점을 선택하세요.");
				System.out.println("ex) 2 5(2번 줄 5번 좌석)");
				
				int colNum = input.nextInt();
				int rowNum = input.nextInt();
				
				reservation.setReserve(true);
				reservation.ReservationCancelation(colNum, rowNum);
				reservation.setReserve(false);
			}
			
			else if(selectedNum == CANCELATION)
			{
				System.out.println("예약취소 할 지점을 선택하세요.");
				System.out.println("ex) 2 5(2번 줄 5번 좌석)");
				
				int colNum = input.nextInt();
				int rowNum = input.nextInt();
				
				reservation.setCancel(true);
				reservation.ReservationCancelation(colNum, rowNum);
				reservation.setCancel(false);
			}
			
			else if(selectedNum == EXIT)
			{
				System.out.println("프로그램을 종료합니다.");
				break;
			}
				
		}
	}
	
	public static void main(String[] args) {
		new Main().start();
	}
}
